import { EndpointRequestInit as EndpointRequestInit_1 } from "@vaadin/hilla-frontend";
import type CompanyEnrollment_1 from "./ai/spring/demo/ai/playground/data/CompanyEnrollment.js";
import client_1 from "./connect-client.default.js";
async function getAllCompanies_1(init?: EndpointRequestInit_1): Promise<Array<CompanyEnrollment_1>> { return client_1.call("CompanyEnrollmentController", "getAllCompanies", {}, init); }
export { getAllCompanies_1 as getAllCompanies };
