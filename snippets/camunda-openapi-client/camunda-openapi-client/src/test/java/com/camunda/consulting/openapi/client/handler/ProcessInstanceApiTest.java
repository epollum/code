/*
 * Camunda BPM REST API
 * OpenApi Spec for Camunda BPM REST API.
 *
 * The version of the OpenAPI document: 7.13.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.openapi.client.handler;

import com.camunda.consulting.openapi.client.handler.ApiException;
import com.camunda.consulting.openapi.client.model.ActivityInstanceDto;
import com.camunda.consulting.openapi.client.model.AuthorizationExceptionDto;
import com.camunda.consulting.openapi.client.model.BatchDto;
import com.camunda.consulting.openapi.client.model.CountResultDto;
import com.camunda.consulting.openapi.client.model.DeleteProcessInstancesDto;
import com.camunda.consulting.openapi.client.model.ExceptionDto;
import java.io.File;
import com.camunda.consulting.openapi.client.model.PatchVariablesDto;
import com.camunda.consulting.openapi.client.model.ProcessInstanceDto;
import com.camunda.consulting.openapi.client.model.ProcessInstanceModificationDto;
import com.camunda.consulting.openapi.client.model.ProcessInstanceQueryDto;
import com.camunda.consulting.openapi.client.model.ProcessInstanceSuspensionStateAsyncDto;
import com.camunda.consulting.openapi.client.model.ProcessInstanceSuspensionStateDto;
import com.camunda.consulting.openapi.client.model.SetJobRetriesByProcessDto;
import com.camunda.consulting.openapi.client.model.SuspensionStateDto;
import com.camunda.consulting.openapi.client.model.VariableValueDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProcessInstanceApi
 */
@Ignore
public class ProcessInstanceApiTest {

    private final ProcessInstanceApi api = new ProcessInstanceApi();

    
    /**
     * 
     *
     * Deletes a set of process instances asynchronously (batch) based on a historic process instance query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAsyncHistoricQueryBasedTest() throws ApiException {
        DeleteProcessInstancesDto deleteProcessInstancesDto = null;
        BatchDto response = api.deleteAsyncHistoricQueryBased(deleteProcessInstancesDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes a running process instance by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProcessInstanceTest() throws ApiException {
        String id = null;
        Boolean skipCustomListeners = null;
        Boolean skipIoMappings = null;
        Boolean skipSubprocesses = null;
        Boolean failIfNotExists = null;
        api.deleteProcessInstance(id, skipCustomListeners, skipIoMappings, skipSubprocesses, failIfNotExists);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes a variable of a process instance by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProcessInstanceVariableTest() throws ApiException {
        String id = null;
        String varName = null;
        api.deleteProcessInstanceVariable(id, varName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes multiple process instances asynchronously (batch).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProcessInstancesAsyncOperationTest() throws ApiException {
        DeleteProcessInstancesDto deleteProcessInstancesDto = null;
        BatchDto response = api.deleteProcessInstancesAsyncOperation(deleteProcessInstancesDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves an Activity Instance (Tree) for a given process instance by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivityInstanceTreeTest() throws ApiException {
        String id = null;
        ActivityInstanceDto response = api.getActivityInstanceTree(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves a variable of a given process instance by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessInstanceVariableTest() throws ApiException {
        String id = null;
        String varName = null;
        Boolean deserializeValue = null;
        VariableValueDto response = api.getProcessInstanceVariable(id, varName, deserializeValue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves the content of a Process Variable by the Process Instance id and the Process Variable name. Applicable for byte array or file Process Variables.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessInstanceVariableBinaryTest() throws ApiException {
        String id = null;
        String varName = null;
        File response = api.getProcessInstanceVariableBinary(id, varName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves all variables of a given process instance by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessInstanceVariablesTest() throws ApiException {
        String id = null;
        Boolean deserializeValue = null;
        Map<String, VariableValueDto> response = api.getProcessInstanceVariables(id, deserializeValue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for process instances that fulfill given parameters. Parameters may be static as well as dynamic runtime properties of process instances. The size of the result set can be retrieved by using the Get Instance Count method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessInstancesTest() throws ApiException {
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        String processInstanceIds = null;
        String businessKey = null;
        String businessKeyLike = null;
        String caseInstanceId = null;
        String processDefinitionId = null;
        String processDefinitionKey = null;
        String processDefinitionKeyIn = null;
        String processDefinitionKeyNotIn = null;
        String deploymentId = null;
        String superProcessInstance = null;
        String subProcessInstance = null;
        String superCaseInstance = null;
        String subCaseInstance = null;
        Boolean active = null;
        Boolean suspended = null;
        Boolean withIncident = null;
        String incidentId = null;
        String incidentType = null;
        String incidentMessage = null;
        String incidentMessageLike = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean processDefinitionWithoutTenantId = null;
        String activityIdIn = null;
        Boolean rootProcessInstances = null;
        Boolean leafProcessInstances = null;
        String variables = null;
        Boolean variableNamesIgnoreCase = null;
        Boolean variableValuesIgnoreCase = null;
        List<ProcessInstanceDto> response = api.getProcessInstances(sortBy, sortOrder, firstResult, maxResults, processInstanceIds, businessKey, businessKeyLike, caseInstanceId, processDefinitionId, processDefinitionKey, processDefinitionKeyIn, processDefinitionKeyNotIn, deploymentId, superProcessInstance, subProcessInstance, superCaseInstance, subCaseInstance, active, suspended, withIncident, incidentId, incidentType, incidentMessage, incidentMessageLike, tenantIdIn, withoutTenantId, processDefinitionWithoutTenantId, activityIdIn, rootProcessInstances, leafProcessInstances, variables, variableNamesIgnoreCase, variableValuesIgnoreCase);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for the number of process instances that fulfill given parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessInstancesCountTest() throws ApiException {
        String processInstanceIds = null;
        String businessKey = null;
        String businessKeyLike = null;
        String caseInstanceId = null;
        String processDefinitionId = null;
        String processDefinitionKey = null;
        String processDefinitionKeyIn = null;
        String processDefinitionKeyNotIn = null;
        String deploymentId = null;
        String superProcessInstance = null;
        String subProcessInstance = null;
        String superCaseInstance = null;
        String subCaseInstance = null;
        Boolean active = null;
        Boolean suspended = null;
        Boolean withIncident = null;
        String incidentId = null;
        String incidentType = null;
        String incidentMessage = null;
        String incidentMessageLike = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean processDefinitionWithoutTenantId = null;
        String activityIdIn = null;
        Boolean rootProcessInstances = null;
        Boolean leafProcessInstances = null;
        String variables = null;
        Boolean variableNamesIgnoreCase = null;
        Boolean variableValuesIgnoreCase = null;
        CountResultDto response = api.getProcessInstancesCount(processInstanceIds, businessKey, businessKeyLike, caseInstanceId, processDefinitionId, processDefinitionKey, processDefinitionKeyIn, processDefinitionKeyNotIn, deploymentId, superProcessInstance, subProcessInstance, superCaseInstance, subCaseInstance, active, suspended, withIncident, incidentId, incidentType, incidentMessage, incidentMessageLike, tenantIdIn, withoutTenantId, processDefinitionWithoutTenantId, activityIdIn, rootProcessInstances, leafProcessInstances, variables, variableNamesIgnoreCase, variableValuesIgnoreCase);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Submits a list of modification instructions to change a process instance&#39;s execution state. A modification instruction is one of the following:  * Starting execution before an activity * Starting execution after an activity on its single outgoing sequence flow * Starting execution on a specific sequence flow * Canceling an activity instance, transition instance, or all instances (activity or transition) for an activity  Instructions are executed immediately and in the order they are provided in this request&#39;s body. Variables can be provided with every starting instruction.  The exact semantics of modification can be read about in the [User guide](https://docs.camunda.org/manual/develop/user-guide/process-engine/process-instance-modification/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyProcessInstanceTest() throws ApiException {
        String id = null;
        ProcessInstanceModificationDto processInstanceModificationDto = null;
        api.modifyProcessInstance(id, processInstanceModificationDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Submits a list of modification instructions to change a process instance&#39;s execution state async. A modification instruction is one of the following:  * Starting execution before an activity * Starting execution after an activity on its single outgoing sequence flow * Starting execution on a specific sequence flow * Cancelling an activity instance, transition instance, or all instances (activity or transition) for an activity  Instructions are executed asynchronous and in the order they are provided in this request&#39;s body. Variables can be provided with every starting instruction.  The exact semantics of modification can be read about in the [User guide](https://docs.camunda.org/manual/7.13/user-guide/process-engine/process-instance-modification/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyProcessInstanceAsyncOperationTest() throws ApiException {
        String id = null;
        ProcessInstanceModificationDto processInstanceModificationDto = null;
        BatchDto response = api.modifyProcessInstanceAsyncOperation(id, processInstanceModificationDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates or deletes the variables of a process instance by id. Updates precede deletions. So, if a variable is updated AND deleted, the deletion overrides the update.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyProcessInstanceVariablesTest() throws ApiException {
        String id = null;
        PatchVariablesDto patchVariablesDto = null;
        api.modifyProcessInstanceVariables(id, patchVariablesDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for process instances that fulfill given parameters through a JSON object. This method is slightly more powerful than the Get Instances method because it allows filtering by multiple process variables of types &#x60;string&#x60;, &#x60;number&#x60; or &#x60;boolean&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryProcessInstancesTest() throws ApiException {
        Integer firstResult = null;
        Integer maxResults = null;
        ProcessInstanceQueryDto processInstanceQueryDto = null;
        List<ProcessInstanceDto> response = api.queryProcessInstances(firstResult, maxResults, processInstanceQueryDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for the number of process instances that fulfill the given parameters. This method takes the same message body as the Get Instances (POST) method and therefore it is slightly more powerful than the Get Instance Count method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryProcessInstancesCountTest() throws ApiException {
        ProcessInstanceQueryDto processInstanceQueryDto = null;
        CountResultDto response = api.queryProcessInstancesCount(processInstanceQueryDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sets a variable of a given process instance by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setProcessInstanceVariableTest() throws ApiException {
        String id = null;
        String varName = null;
        VariableValueDto variableValueDto = null;
        api.setProcessInstanceVariable(id, varName, variableValueDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sets the serialized value for a binary variable or the binary value for a file variable.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setProcessInstanceVariableBinaryTest() throws ApiException {
        String id = null;
        String varName = null;
        File data = null;
        String valueType = null;
        api.setProcessInstanceVariableBinary(id, varName, data, valueType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a batch to set retries of jobs associated with given processes asynchronously.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setRetriesByProcessTest() throws ApiException {
        SetJobRetriesByProcessDto setJobRetriesByProcessDto = null;
        BatchDto response = api.setRetriesByProcess(setJobRetriesByProcessDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a batch to set retries of jobs asynchronously based on a historic process instance query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setRetriesByProcessHistoricQueryBasedTest() throws ApiException {
        SetJobRetriesByProcessDto setJobRetriesByProcessDto = null;
        BatchDto response = api.setRetriesByProcessHistoricQueryBased(setJobRetriesByProcessDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Activates or suspends process instances by providing certain criteria:  # Activate/Suspend Process Instance By Process Definition Id * &#x60;suspend&#x60; * &#x60;processDefinitionId&#x60;  # Activate/Suspend Process Instance By Process Definition Key  * &#x60;suspend&#x60; * &#x60;processDefinitionKey&#x60; * &#x60;processDefinitionTenantId&#x60; * &#x60;processDefinitionWithoutTenantId&#x60;  # Activate/Suspend Process Instance In Group * &#x60;suspend&#x60; * &#x60;processInstanceIds&#x60; * &#x60;processInstanceQuery&#x60; * &#x60;historicProcessInstanceQuery&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSuspensionStateTest() throws ApiException {
        ProcessInstanceSuspensionStateDto processInstanceSuspensionStateDto = null;
        api.updateSuspensionState(processInstanceSuspensionStateDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Activates or suspends process instances asynchronously with a list of process instance ids, a process instance query, and/or a historical process instance query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSuspensionStateAsyncOperationTest() throws ApiException {
        ProcessInstanceSuspensionStateAsyncDto processInstanceSuspensionStateAsyncDto = null;
        BatchDto response = api.updateSuspensionStateAsyncOperation(processInstanceSuspensionStateAsyncDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Activates or suspends a given process instance by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSuspensionStateByIdTest() throws ApiException {
        String id = null;
        SuspensionStateDto suspensionStateDto = null;
        api.updateSuspensionStateById(id, suspensionStateDto);

        // TODO: test validations
    }
    
}