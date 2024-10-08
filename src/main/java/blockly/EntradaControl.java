package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class EntradaControl {

public static final int TIMEOUT = 300;

/**
 *
 * @author Herick Victor Rodrigues
 * @since 04/10/2024, 13:11:25
 *
 */
public static Var Execute() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param entrada<app.entity.Entrada>
 *
 * @author Herick Victor Rodrigues
 * @since 04/10/2024, 13:11:25
 *
 */
public static void afterDelete(@ParamMetaData(description = "entrada", id = "9c704019") Var entrada) throws Exception {
  new Callable<Var>() {

   private Var productToUpdate = Var.VAR_NULL;

   public Var call() throws Exception {
    productToUpdate =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",
    cronapi.conversion.Operations.toString(
    cronapi.object.Operations.getObjectField(
    cronapi.object.Operations.getObjectField(entrada,
    Var.valueOf("product")),
    Var.valueOf("id")))));
    cronapi.database.Operations.updateField(productToUpdate,
    Var.valueOf("quantity"),
    cronapi.math.Operations.subtract(
    cronapi.database.Operations.getField(productToUpdate,
    Var.valueOf("this[0].quantity")),
    cronapi.object.Operations.getObjectField(entrada,
    Var.valueOf("qtdEntrada"))));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param entrada<app.entity.Entrada>
 *
 * @author Herick Victor Rodrigues
 * @since 04/10/2024, 13:11:25
 *
 */
public static void afterInsert(@ParamMetaData(description = "entrada", id = "9c704019") Var entrada) throws Exception {
  new Callable<Var>() {

   private Var productToUpdate = Var.VAR_NULL;

   public Var call() throws Exception {
    productToUpdate =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",
    cronapi.conversion.Operations.toString(
    cronapi.object.Operations.getObjectField(
    cronapi.object.Operations.getObjectField(entrada,
    Var.valueOf("product")),
    Var.valueOf("id")))));
    cronapi.database.Operations.updateField(productToUpdate,
    Var.valueOf("quantity"),
    cronapi.math.Operations.sum(
    cronapi.database.Operations.getField(productToUpdate,
    Var.valueOf("this[0].quantity")),
    cronapi.object.Operations.getObjectField(entrada,
    Var.valueOf("qtdEntrada"))));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param entrada<app.entity.Entrada>
 *
 * @author Herick Victor Rodrigues
 * @since 04/10/2024, 13:11:25
 *
 */
public static void beforeInsert(@ParamMetaData(description = "param_entrada", id = "5c8b95e0") Var param_entrada) throws Exception {
  new Callable<Var>() {

   // param
   private Var entrada = param_entrada;
   // end

   public Var call() throws Exception {
    if (
    Var.valueOf(
    cronapi.object.Operations.getObjectField(entrada,
    Var.valueOf("qtdEntrada")).compareTo(
    Var.valueOf(1)) < 0).getObjectAsBoolean()) {
        cronapi.util.Operations.throwException(
        Var.valueOf("A quantidade da entrada não pode ser menor do que um."));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

}

