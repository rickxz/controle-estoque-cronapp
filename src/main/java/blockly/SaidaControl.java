package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class SaidaControl {

public static final int TIMEOUT = 300;

/**
 *
 * @author Herick Victor Rodrigues
 * @since 04/10/2024, 11:35:04
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
 * @param saida<app.entity.Saida>
 *
 * @author Herick Victor Rodrigues
 * @since 04/10/2024, 11:35:04
 *
 */
public static void afterDelete(@ParamMetaData(description = "saida", id = "8e13e7e9") Var saida) throws Exception {
  new Callable<Var>() {

   private Var productToUpdate = Var.VAR_NULL;

   public Var call() throws Exception {
    productToUpdate =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",
    cronapi.conversion.Operations.toString(
    cronapi.object.Operations.getObjectField(
    cronapi.object.Operations.getObjectField(saida,
    Var.valueOf("product")),
    Var.valueOf("id")))));
    cronapi.database.Operations.updateField(productToUpdate,
    Var.valueOf("quantity"),
    cronapi.math.Operations.sum(
    cronapi.database.Operations.getField(productToUpdate,
    Var.valueOf("this[0].quantity")),
    cronapi.object.Operations.getObjectField(saida,
    Var.valueOf("qtdSaida"))));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param saida<app.entity.Saida>
 *
 * @author Herick Victor Rodrigues
 * @since 04/10/2024, 11:35:04
 *
 */
public static void afterInsert(@ParamMetaData(description = "saida", id = "8e13e7e9") Var saida) throws Exception {
  new Callable<Var>() {

   private Var productToUpdate = Var.VAR_NULL;

   public Var call() throws Exception {
    productToUpdate =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",
    cronapi.conversion.Operations.toString(
    cronapi.object.Operations.getObjectField(
    cronapi.object.Operations.getObjectField(saida,
    Var.valueOf("product")),
    Var.valueOf("id")))));
    cronapi.database.Operations.updateField(productToUpdate,
    Var.valueOf("quantity"),
    cronapi.math.Operations.subtract(
    cronapi.database.Operations.getField(productToUpdate,
    Var.valueOf("this[0].quantity")),
    cronapi.object.Operations.getObjectField(saida,
    Var.valueOf("qtdSaida"))));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param saida<app.entity.Saida>
 *
 * @author Herick Victor Rodrigues
 * @since 04/10/2024, 11:35:04
 *
 */
public static void beforeInsert(@ParamMetaData(description = "saida", id = "a5b27121") Var saida) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    if (
    Var.valueOf(
    cronapi.object.Operations.getObjectField(saida,
    Var.valueOf("qtdSaida")).compareTo(
    Var.valueOf(1)) < 0).getObjectAsBoolean()) {
        cronapi.util.Operations.throwException(
        Var.valueOf("A quantidade da saída não pode ser menor do que um."));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

}

