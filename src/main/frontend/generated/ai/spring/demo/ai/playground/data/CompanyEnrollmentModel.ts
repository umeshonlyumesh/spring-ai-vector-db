import { _getPropertyModel as _getPropertyModel_1, makeObjectEmptyValueCreator as makeObjectEmptyValueCreator_1, NumberModel as NumberModel_1, ObjectModel as ObjectModel_1, StringModel as StringModel_1 } from "@vaadin/hilla-lit-form";
import type CompanyEnrollment_1 from "./CompanyEnrollment.js";
class CompanyEnrollmentModel<T extends CompanyEnrollment_1 = CompanyEnrollment_1> extends ObjectModel_1<T> {
    static override createEmptyValue = makeObjectEmptyValueCreator_1(CompanyEnrollmentModel);
    get id(): NumberModel_1 {
        return this[_getPropertyModel_1]("id", (parent, key) => new NumberModel_1(parent, key, true, { meta: { annotations: [{ name: "jakarta.persistence.Id" }], javaType: "java.lang.Long" } }));
    }
    get companyName(): StringModel_1 {
        return this[_getPropertyModel_1]("companyName", (parent, key) => new StringModel_1(parent, key, false, { meta: { javaType: "java.lang.String" } }));
    }
    get clientId(): StringModel_1 {
        return this[_getPropertyModel_1]("clientId", (parent, key) => new StringModel_1(parent, key, false, { meta: { javaType: "java.lang.String" } }));
    }
    get accountNumber(): NumberModel_1 {
        return this[_getPropertyModel_1]("accountNumber", (parent, key) => new NumberModel_1(parent, key, false, { meta: { javaType: "java.lang.Long" } }));
    }
    get routingNumber(): NumberModel_1 {
        return this[_getPropertyModel_1]("routingNumber", (parent, key) => new NumberModel_1(parent, key, false, { meta: { javaType: "java.lang.Long" } }));
    }
    get status(): StringModel_1 {
        return this[_getPropertyModel_1]("status", (parent, key) => new StringModel_1(parent, key, false, { meta: { javaType: "java.lang.String" } }));
    }
}
export default CompanyEnrollmentModel;
