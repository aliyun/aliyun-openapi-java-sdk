/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity42;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity42.EnvExecutableEntityWithResult43;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity42.EnvExecutableEntityWithResult43.EnvExecutableEntity44;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity42.EnvExecutableEntityWithResult43.EnvExecutableEntity44.EnvEntity50;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity42.EnvExecutableEntityWithResult43.EnvExecutableEntity44.EnvEntity50.Entity51;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity42.EnvExecutableEntityWithResult43.ErrorCode45;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity42.EnvExecutableEntityWithResult43.MessageDetailItem48;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity42.EnvExecutableEntityWithResult43.MessageParamsItem49;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52.ActionTypesItem71;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52.OpsGenericEntityRelation68;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52.OpsGenericEntityRelation68.TransitableWithStateEntity73;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52.OpsGenericEntityRelation68.TransitableWithStateEntity73.EnvExecutableEntityWithResult74;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52.OpsGenericEntityRelation68.TransitableWithStateEntity73.EnvExecutableEntityWithResult74.EnvExecutableEntity75;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52.OpsGenericEntityRelation68.TransitableWithStateEntity73.EnvExecutableEntityWithResult74.EnvExecutableEntity75.EnvEntity81;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52.OpsGenericEntityRelation68.TransitableWithStateEntity73.EnvExecutableEntityWithResult74.EnvExecutableEntity75.EnvEntity81.Entity82;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52.OpsGenericEntityRelation68.TransitableWithStateEntity73.EnvExecutableEntityWithResult74.ErrorCode76;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52.OpsGenericEntityRelation68.TransitableWithStateEntity73.EnvExecutableEntityWithResult74.MessageDetailItem79;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52.OpsGenericEntityRelation68.TransitableWithStateEntity73.EnvExecutableEntityWithResult74.MessageParamsItem80;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement52.OpsGenericEnvConfigItem72;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.TasksItem54;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.TasksItem54.ContextItem57;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.TasksItem54.EntityRelation55;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.TasksItem54.EntityRelation55.TransitableWithStateEntity58;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.TasksItem54.EntityRelation55.TransitableWithStateEntity58.EnvExecutableEntityWithResult59;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.TasksItem54.EntityRelation55.TransitableWithStateEntity58.EnvExecutableEntityWithResult59.EnvExecutableEntity60;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.TasksItem54.EntityRelation55.TransitableWithStateEntity58.EnvExecutableEntityWithResult59.EnvExecutableEntity60.EnvEntity66;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.TasksItem54.EntityRelation55.TransitableWithStateEntity58.EnvExecutableEntityWithResult59.EnvExecutableEntity60.EnvEntity66.Entity67;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.TasksItem54.EntityRelation55.TransitableWithStateEntity58.EnvExecutableEntityWithResult59.ErrorCode61;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.TasksItem54.EntityRelation55.TransitableWithStateEntity58.EnvExecutableEntityWithResult59.MessageDetailItem64;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.TasksItem54.EntityRelation55.TransitableWithStateEntity58.EnvExecutableEntityWithResult59.MessageParamsItem65;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.EnvConfigItem;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement.ActionTypesItem;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement.OpsGenericEntityRelation;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity1;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity1.EnvExecutableEntityWithResult2;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity1.EnvExecutableEntityWithResult2.EnvExecutableEntity3;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity1.EnvExecutableEntityWithResult2.EnvExecutableEntity3.EnvEntity9;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity1.EnvExecutableEntityWithResult2.EnvExecutableEntity3.EnvEntity9.Entity10;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity1.EnvExecutableEntityWithResult2.ErrorCode4;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity1.EnvExecutableEntityWithResult2.MessageDetailItem7;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity1.EnvExecutableEntityWithResult2.MessageParamsItem8;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.OpsGenericArrangement.OpsGenericEnvConfigItem;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.TasksItem;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.TasksItem.ContextItem;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.TasksItem.EntityRelation;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.TasksItem.EntityRelation.TransitableWithStateEntity;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.TasksItem.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.TasksItem.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.TasksItem.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.TasksItem.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.TasksItem.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.TasksItem.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetailItem;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangementsItem.TasksItem.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParamsItem;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11.ActionTypesItem30;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11.OpsGenericEntityRelation27;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11.OpsGenericEntityRelation27.TransitableWithStateEntity32;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11.OpsGenericEntityRelation27.TransitableWithStateEntity32.EnvExecutableEntityWithResult33;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11.OpsGenericEntityRelation27.TransitableWithStateEntity32.EnvExecutableEntityWithResult33.EnvExecutableEntity34;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11.OpsGenericEntityRelation27.TransitableWithStateEntity32.EnvExecutableEntityWithResult33.EnvExecutableEntity34.EnvEntity40;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11.OpsGenericEntityRelation27.TransitableWithStateEntity32.EnvExecutableEntityWithResult33.EnvExecutableEntity34.EnvEntity40.Entity41;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11.OpsGenericEntityRelation27.TransitableWithStateEntity32.EnvExecutableEntityWithResult33.ErrorCode35;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11.OpsGenericEntityRelation27.TransitableWithStateEntity32.EnvExecutableEntityWithResult33.MessageDetailItem38;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11.OpsGenericEntityRelation27.TransitableWithStateEntity32.EnvExecutableEntityWithResult33.MessageParamsItem39;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.OpsGenericArrangement11.OpsGenericEnvConfigItem31;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.TasksItem13;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.TasksItem13.ContextItem16;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.TasksItem13.EntityRelation14;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.TasksItem13.EntityRelation14.TransitableWithStateEntity17;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.TasksItem13.EntityRelation14.TransitableWithStateEntity17.EnvExecutableEntityWithResult18;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.TasksItem13.EntityRelation14.TransitableWithStateEntity17.EnvExecutableEntityWithResult18.EnvExecutableEntity19;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.TasksItem13.EntityRelation14.TransitableWithStateEntity17.EnvExecutableEntityWithResult18.EnvExecutableEntity19.EnvEntity25;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.TasksItem13.EntityRelation14.TransitableWithStateEntity17.EnvExecutableEntityWithResult18.EnvExecutableEntity19.EnvEntity25.Entity26;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.TasksItem13.EntityRelation14.TransitableWithStateEntity17.EnvExecutableEntityWithResult18.ErrorCode20;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.TasksItem13.EntityRelation14.TransitableWithStateEntity17.EnvExecutableEntityWithResult18.MessageDetailItem23;
import com.aliyuncs.sofa.model.v20190815.ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangementsItem.TasksItem13.EntityRelation14.TransitableWithStateEntity17.EnvExecutableEntityWithResult18.MessageParamsItem24;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReinitAKSOpsContainerServiceResponseUnmarshaller {

	public static ReinitAKSOpsContainerServiceResponse unmarshall(ReinitAKSOpsContainerServiceResponse reinitAKSOpsContainerServiceResponse, UnmarshallerContext _ctx) {
		
		reinitAKSOpsContainerServiceResponse.setRequestId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.RequestId"));
		reinitAKSOpsContainerServiceResponse.setResultCode(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.ResultCode"));
		reinitAKSOpsContainerServiceResponse.setResultMessage(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.ResultMessage"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.AppName"));
		data.setArrangementId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.ArrangementId"));
		data.setExecutorId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.ExecutorId"));
		data.setExecutorName(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.ExecutorName"));
		data.setGrayTraffic(_ctx.booleanValue("ReinitAKSOpsContainerServiceResponse.Data.GrayTraffic"));
		data.setIsRollbackType(_ctx.booleanValue("ReinitAKSOpsContainerServiceResponse.Data.IsRollbackType"));
		data.setName(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.Name"));
		data.setNamespace(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.Namespace"));
		data.setOpsType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.OpsType"));
		data.setResultContext(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.ResultContext"));
		data.setRevision(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.Revision"));
		data.setRollbackEntityId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.RollbackEntityId"));
		data.setRollbackEntityType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.RollbackEntityType"));
		data.setRollbackRevision(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.RollbackRevision"));
		data.setServiceGroupCollectionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.ServiceGroupCollectionId"));
		data.setTargetId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.TargetId"));

		BaseEntityRelation baseEntityRelation = new BaseEntityRelation();
		baseEntityRelation.setParentEntityType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.ParentEntityType"));
		baseEntityRelation.setParentId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.ParentId"));
		baseEntityRelation.setProcessDefinitionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.ProcessDefinitionId"));

		TransitableWithStateEntity42 transitableWithStateEntity42 = new TransitableWithStateEntity42();
		transitableWithStateEntity42.setState(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.State"));

		EnvExecutableEntityWithResult43 envExecutableEntityWithResult43 = new EnvExecutableEntityWithResult43();

		EnvExecutableEntity44 envExecutableEntity44 = new EnvExecutableEntity44();
		envExecutableEntity44.setFinishedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.FinishedTime"));
		envExecutableEntity44.setStandaloneExecutable(_ctx.booleanValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StandaloneExecutable"));
		envExecutableEntity44.setStartedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StartedTime"));

		EnvEntity50 envEntity50 = new EnvEntity50();
		envEntity50.setRegionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RegionId"));
		envEntity50.setRunEnv(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RunEnv"));
		envEntity50.setTenantId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.TenantId"));
		envEntity50.setWorkspaceId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.WorkspaceId"));

		Entity51 entity51 = new Entity51();
		entity51.setCreatedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.CreatedTime"));
		entity51.setId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.Id"));
		entity51.setModifiedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.ModifiedTime"));
		envEntity50.setEntity51(entity51);
		envExecutableEntity44.setEnvEntity50(envEntity50);
		envExecutableEntityWithResult43.setEnvExecutableEntity44(envExecutableEntity44);

		ErrorCode45 errorCode45 = new ErrorCode45();
		errorCode45.setExceptionCode(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.ExceptionCode"));
		errorCode45.setLevel(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Level"));
		errorCode45.setPrefix(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Prefix"));
		errorCode45.setScene(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Scene"));
		errorCode45.setType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Type"));
		errorCode45.setVersion(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Version"));
		envExecutableEntityWithResult43.setErrorCode45(errorCode45);

		List<MessageDetailItem48> messageDetail46 = new ArrayList<MessageDetailItem48>();
		for (int i = 0; i < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail.Length"); i++) {
			MessageDetailItem48 messageDetailItem48 = new MessageDetailItem48();
			messageDetailItem48.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ i +"].Key"));
			messageDetailItem48.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ i +"].Value"));

			messageDetail46.add(messageDetailItem48);
		}
		envExecutableEntityWithResult43.setMessageDetail46(messageDetail46);

		List<MessageParamsItem49> messageParams47 = new ArrayList<MessageParamsItem49>();
		for (int i = 0; i < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams.Length"); i++) {
			MessageParamsItem49 messageParamsItem49 = new MessageParamsItem49();
			messageParamsItem49.setData(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.BaseEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams["+ i +"].Data"));

			messageParams47.add(messageParamsItem49);
		}
		envExecutableEntityWithResult43.setMessageParams47(messageParams47);
		transitableWithStateEntity42.setEnvExecutableEntityWithResult43(envExecutableEntityWithResult43);
		baseEntityRelation.setTransitableWithStateEntity42(transitableWithStateEntity42);
		data.setBaseEntityRelation(baseEntityRelation);

		DeploymentArrangement deploymentArrangement = new DeploymentArrangement();

		OpsGenericArrangement52 opsGenericArrangement52 = new OpsGenericArrangement52();
		opsGenericArrangement52.setArrangementType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.ArrangementType"));
		opsGenericArrangement52.setName(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.Name"));
		opsGenericArrangement52.setServiceGroupCollectionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.ServiceGroupCollectionId"));

		OpsGenericEntityRelation68 opsGenericEntityRelation68 = new OpsGenericEntityRelation68();
		opsGenericEntityRelation68.setParentEntityType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.ParentEntityType"));
		opsGenericEntityRelation68.setParentId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.ParentId"));
		opsGenericEntityRelation68.setProcessDefinitionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.ProcessDefinitionId"));

		TransitableWithStateEntity73 transitableWithStateEntity73 = new TransitableWithStateEntity73();
		transitableWithStateEntity73.setState(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.State"));

		EnvExecutableEntityWithResult74 envExecutableEntityWithResult74 = new EnvExecutableEntityWithResult74();

		EnvExecutableEntity75 envExecutableEntity75 = new EnvExecutableEntity75();
		envExecutableEntity75.setFinishedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.FinishedTime"));
		envExecutableEntity75.setStandaloneExecutable(_ctx.booleanValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StandaloneExecutable"));
		envExecutableEntity75.setStartedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StartedTime"));

		EnvEntity81 envEntity81 = new EnvEntity81();
		envEntity81.setRegionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RegionId"));
		envEntity81.setRunEnv(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RunEnv"));
		envEntity81.setTenantId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.TenantId"));
		envEntity81.setWorkspaceId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.WorkspaceId"));

		Entity82 entity82 = new Entity82();
		entity82.setCreatedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.CreatedTime"));
		entity82.setId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.Id"));
		entity82.setModifiedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.ModifiedTime"));
		envEntity81.setEntity82(entity82);
		envExecutableEntity75.setEnvEntity81(envEntity81);
		envExecutableEntityWithResult74.setEnvExecutableEntity75(envExecutableEntity75);

		ErrorCode76 errorCode76 = new ErrorCode76();
		errorCode76.setExceptionCode(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.ExceptionCode"));
		errorCode76.setLevel(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Level"));
		errorCode76.setPrefix(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Prefix"));
		errorCode76.setScene(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Scene"));
		errorCode76.setType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Type"));
		errorCode76.setVersion(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Version"));
		envExecutableEntityWithResult74.setErrorCode76(errorCode76);

		List<MessageDetailItem79> messageDetail77 = new ArrayList<MessageDetailItem79>();
		for (int i = 0; i < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail.Length"); i++) {
			MessageDetailItem79 messageDetailItem79 = new MessageDetailItem79();
			messageDetailItem79.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ i +"].Key"));
			messageDetailItem79.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ i +"].Value"));

			messageDetail77.add(messageDetailItem79);
		}
		envExecutableEntityWithResult74.setMessageDetail77(messageDetail77);

		List<MessageParamsItem80> messageParams78 = new ArrayList<MessageParamsItem80>();
		for (int i = 0; i < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams.Length"); i++) {
			MessageParamsItem80 messageParamsItem80 = new MessageParamsItem80();
			messageParamsItem80.setData(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams["+ i +"].Data"));

			messageParams78.add(messageParamsItem80);
		}
		envExecutableEntityWithResult74.setMessageParams78(messageParams78);
		transitableWithStateEntity73.setEnvExecutableEntityWithResult74(envExecutableEntityWithResult74);
		opsGenericEntityRelation68.setTransitableWithStateEntity73(transitableWithStateEntity73);
		opsGenericArrangement52.setOpsGenericEntityRelation68(opsGenericEntityRelation68);

		List<ActionTypesItem71> actionTypes69 = new ArrayList<ActionTypesItem71>();
		for (int i = 0; i < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.ActionTypes.Length"); i++) {
			ActionTypesItem71 actionTypesItem71 = new ActionTypesItem71();
			actionTypesItem71.setData(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.ActionTypes["+ i +"].Data"));

			actionTypes69.add(actionTypesItem71);
		}
		opsGenericArrangement52.setActionTypes69(actionTypes69);

		List<OpsGenericEnvConfigItem72> opsGenericEnvConfig70 = new ArrayList<OpsGenericEnvConfigItem72>();
		for (int i = 0; i < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEnvConfig.Length"); i++) {
			OpsGenericEnvConfigItem72 opsGenericEnvConfigItem72 = new OpsGenericEnvConfigItem72();
			opsGenericEnvConfigItem72.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEnvConfig["+ i +"].Key"));
			opsGenericEnvConfigItem72.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.OpsGenericArrangement.OpsGenericEnvConfig["+ i +"].Value"));

			opsGenericEnvConfig70.add(opsGenericEnvConfigItem72);
		}
		opsGenericArrangement52.setOpsGenericEnvConfig70(opsGenericEnvConfig70);
		deploymentArrangement.setOpsGenericArrangement52(opsGenericArrangement52);

		List<TasksItem54> tasks53 = new ArrayList<TasksItem54>();
		for (int i = 0; i < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks.Length"); i++) {
			TasksItem54 tasksItem54 = new TasksItem54();
			tasksItem54.setActionHandlerCode(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].ActionHandlerCode"));
			tasksItem54.setArrangementId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].ArrangementId"));
			tasksItem54.setServiceGroupCollectionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].ServiceGroupCollectionId"));
			tasksItem54.setServiceGroupId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].ServiceGroupId"));
			tasksItem54.setServiceId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].ServiceId"));

			EntityRelation55 entityRelation55 = new EntityRelation55();
			entityRelation55.setParentEntityType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.ParentEntityType"));
			entityRelation55.setParentId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.ParentId"));
			entityRelation55.setProcessDefinitionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.ProcessDefinitionId"));

			TransitableWithStateEntity58 transitableWithStateEntity58 = new TransitableWithStateEntity58();
			transitableWithStateEntity58.setState(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.State"));

			EnvExecutableEntityWithResult59 envExecutableEntityWithResult59 = new EnvExecutableEntityWithResult59();

			EnvExecutableEntity60 envExecutableEntity60 = new EnvExecutableEntity60();
			envExecutableEntity60.setFinishedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.FinishedTime"));
			envExecutableEntity60.setStandaloneExecutable(_ctx.booleanValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StandaloneExecutable"));
			envExecutableEntity60.setStartedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StartedTime"));

			EnvEntity66 envEntity66 = new EnvEntity66();
			envEntity66.setRegionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RegionId"));
			envEntity66.setRunEnv(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RunEnv"));
			envEntity66.setTenantId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.TenantId"));
			envEntity66.setWorkspaceId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.WorkspaceId"));

			Entity67 entity67 = new Entity67();
			entity67.setCreatedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.CreatedTime"));
			entity67.setId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.Id"));
			entity67.setModifiedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.ModifiedTime"));
			envEntity66.setEntity67(entity67);
			envExecutableEntity60.setEnvEntity66(envEntity66);
			envExecutableEntityWithResult59.setEnvExecutableEntity60(envExecutableEntity60);

			ErrorCode61 errorCode61 = new ErrorCode61();
			errorCode61.setExceptionCode(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.ExceptionCode"));
			errorCode61.setLevel(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Level"));
			errorCode61.setPrefix(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Prefix"));
			errorCode61.setScene(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Scene"));
			errorCode61.setType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Type"));
			errorCode61.setVersion(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Version"));
			envExecutableEntityWithResult59.setErrorCode61(errorCode61);

			List<MessageDetailItem64> messageDetail62 = new ArrayList<MessageDetailItem64>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail.Length"); j++) {
				MessageDetailItem64 messageDetailItem64 = new MessageDetailItem64();
				messageDetailItem64.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ j +"].Key"));
				messageDetailItem64.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ j +"].Value"));

				messageDetail62.add(messageDetailItem64);
			}
			envExecutableEntityWithResult59.setMessageDetail62(messageDetail62);

			List<MessageParamsItem65> messageParams63 = new ArrayList<MessageParamsItem65>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams.Length"); j++) {
				MessageParamsItem65 messageParamsItem65 = new MessageParamsItem65();
				messageParamsItem65.setData(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams["+ j +"].Data"));

				messageParams63.add(messageParamsItem65);
			}
			envExecutableEntityWithResult59.setMessageParams63(messageParams63);
			transitableWithStateEntity58.setEnvExecutableEntityWithResult59(envExecutableEntityWithResult59);
			entityRelation55.setTransitableWithStateEntity58(transitableWithStateEntity58);
			tasksItem54.setEntityRelation55(entityRelation55);

			List<ContextItem57> context56 = new ArrayList<ContextItem57>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].Context.Length"); j++) {
				ContextItem57 contextItem57 = new ContextItem57();
				contextItem57.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].Context["+ j +"].Key"));
				contextItem57.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.DeploymentArrangement.Tasks["+ i +"].Context["+ j +"].Value"));

				context56.add(contextItem57);
			}
			tasksItem54.setContext56(context56);

			tasks53.add(tasksItem54);
		}
		deploymentArrangement.setTasks53(tasks53);
		data.setDeploymentArrangement(deploymentArrangement);

		List<EnvConfigItem> envConfig = new ArrayList<EnvConfigItem>();
		for (int i = 0; i < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.EnvConfig.Length"); i++) {
			EnvConfigItem envConfigItem = new EnvConfigItem();
			envConfigItem.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.EnvConfig["+ i +"].Key"));
			envConfigItem.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.EnvConfig["+ i +"].Value"));

			envConfig.add(envConfigItem);
		}
		data.setEnvConfig(envConfig);

		List<PostDeploymentArrangementsItem> postDeploymentArrangements = new ArrayList<PostDeploymentArrangementsItem>();
		for (int i = 0; i < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements.Length"); i++) {
			PostDeploymentArrangementsItem postDeploymentArrangementsItem = new PostDeploymentArrangementsItem();

			OpsGenericArrangement opsGenericArrangement = new OpsGenericArrangement();
			opsGenericArrangement.setArrangementType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.ArrangementType"));
			opsGenericArrangement.setName(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.Name"));
			opsGenericArrangement.setServiceGroupCollectionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.ServiceGroupCollectionId"));

			OpsGenericEntityRelation opsGenericEntityRelation = new OpsGenericEntityRelation();
			opsGenericEntityRelation.setParentEntityType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.ParentEntityType"));
			opsGenericEntityRelation.setParentId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.ParentId"));
			opsGenericEntityRelation.setProcessDefinitionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.ProcessDefinitionId"));

			TransitableWithStateEntity1 transitableWithStateEntity1 = new TransitableWithStateEntity1();
			transitableWithStateEntity1.setState(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.State"));

			EnvExecutableEntityWithResult2 envExecutableEntityWithResult2 = new EnvExecutableEntityWithResult2();

			EnvExecutableEntity3 envExecutableEntity3 = new EnvExecutableEntity3();
			envExecutableEntity3.setFinishedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.FinishedTime"));
			envExecutableEntity3.setStandaloneExecutable(_ctx.booleanValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StandaloneExecutable"));
			envExecutableEntity3.setStartedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StartedTime"));

			EnvEntity9 envEntity9 = new EnvEntity9();
			envEntity9.setRegionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RegionId"));
			envEntity9.setRunEnv(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RunEnv"));
			envEntity9.setTenantId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.TenantId"));
			envEntity9.setWorkspaceId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.WorkspaceId"));

			Entity10 entity10 = new Entity10();
			entity10.setCreatedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.CreatedTime"));
			entity10.setId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.Id"));
			entity10.setModifiedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.ModifiedTime"));
			envEntity9.setEntity10(entity10);
			envExecutableEntity3.setEnvEntity9(envEntity9);
			envExecutableEntityWithResult2.setEnvExecutableEntity3(envExecutableEntity3);

			ErrorCode4 errorCode4 = new ErrorCode4();
			errorCode4.setExceptionCode(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.ExceptionCode"));
			errorCode4.setLevel(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Level"));
			errorCode4.setPrefix(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Prefix"));
			errorCode4.setScene(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Scene"));
			errorCode4.setType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Type"));
			errorCode4.setVersion(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Version"));
			envExecutableEntityWithResult2.setErrorCode4(errorCode4);

			List<MessageDetailItem7> messageDetail5 = new ArrayList<MessageDetailItem7>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail.Length"); j++) {
				MessageDetailItem7 messageDetailItem7 = new MessageDetailItem7();
				messageDetailItem7.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ j +"].Key"));
				messageDetailItem7.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ j +"].Value"));

				messageDetail5.add(messageDetailItem7);
			}
			envExecutableEntityWithResult2.setMessageDetail5(messageDetail5);

			List<MessageParamsItem8> messageParams6 = new ArrayList<MessageParamsItem8>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams.Length"); j++) {
				MessageParamsItem8 messageParamsItem8 = new MessageParamsItem8();
				messageParamsItem8.setData(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams["+ j +"].Data"));

				messageParams6.add(messageParamsItem8);
			}
			envExecutableEntityWithResult2.setMessageParams6(messageParams6);
			transitableWithStateEntity1.setEnvExecutableEntityWithResult2(envExecutableEntityWithResult2);
			opsGenericEntityRelation.setTransitableWithStateEntity1(transitableWithStateEntity1);
			opsGenericArrangement.setOpsGenericEntityRelation(opsGenericEntityRelation);

			List<ActionTypesItem> actionTypes = new ArrayList<ActionTypesItem>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.ActionTypes.Length"); j++) {
				ActionTypesItem actionTypesItem = new ActionTypesItem();
				actionTypesItem.setData(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.ActionTypes["+ j +"].Data"));

				actionTypes.add(actionTypesItem);
			}
			opsGenericArrangement.setActionTypes(actionTypes);

			List<OpsGenericEnvConfigItem> opsGenericEnvConfig = new ArrayList<OpsGenericEnvConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEnvConfig.Length"); j++) {
				OpsGenericEnvConfigItem opsGenericEnvConfigItem = new OpsGenericEnvConfigItem();
				opsGenericEnvConfigItem.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEnvConfig["+ j +"].Key"));
				opsGenericEnvConfigItem.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEnvConfig["+ j +"].Value"));

				opsGenericEnvConfig.add(opsGenericEnvConfigItem);
			}
			opsGenericArrangement.setOpsGenericEnvConfig(opsGenericEnvConfig);
			postDeploymentArrangementsItem.setOpsGenericArrangement(opsGenericArrangement);

			List<TasksItem> tasks = new ArrayList<TasksItem>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks.Length"); j++) {
				TasksItem tasksItem = new TasksItem();
				tasksItem.setActionHandlerCode(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].ActionHandlerCode"));
				tasksItem.setArrangementId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].ArrangementId"));
				tasksItem.setServiceGroupCollectionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].ServiceGroupCollectionId"));
				tasksItem.setServiceGroupId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].ServiceGroupId"));
				tasksItem.setServiceId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].ServiceId"));

				EntityRelation entityRelation = new EntityRelation();
				entityRelation.setParentEntityType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.ParentEntityType"));
				entityRelation.setParentId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.ParentId"));
				entityRelation.setProcessDefinitionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.ProcessDefinitionId"));

				TransitableWithStateEntity transitableWithStateEntity = new TransitableWithStateEntity();
				transitableWithStateEntity.setState(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.State"));

				EnvExecutableEntityWithResult envExecutableEntityWithResult = new EnvExecutableEntityWithResult();

				EnvExecutableEntity envExecutableEntity = new EnvExecutableEntity();
				envExecutableEntity.setFinishedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.FinishedTime"));
				envExecutableEntity.setStandaloneExecutable(_ctx.booleanValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StandaloneExecutable"));
				envExecutableEntity.setStartedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StartedTime"));

				EnvEntity envEntity = new EnvEntity();
				envEntity.setRegionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RegionId"));
				envEntity.setRunEnv(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RunEnv"));
				envEntity.setTenantId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.TenantId"));
				envEntity.setWorkspaceId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.WorkspaceId"));

				Entity entity = new Entity();
				entity.setCreatedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.CreatedTime"));
				entity.setId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.Id"));
				entity.setModifiedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.ModifiedTime"));
				envEntity.setEntity(entity);
				envExecutableEntity.setEnvEntity(envEntity);
				envExecutableEntityWithResult.setEnvExecutableEntity(envExecutableEntity);

				ErrorCode errorCode = new ErrorCode();
				errorCode.setExceptionCode(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.ExceptionCode"));
				errorCode.setLevel(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Level"));
				errorCode.setPrefix(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Prefix"));
				errorCode.setScene(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Scene"));
				errorCode.setType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Type"));
				errorCode.setVersion(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Version"));
				envExecutableEntityWithResult.setErrorCode(errorCode);

				List<MessageDetailItem> messageDetail = new ArrayList<MessageDetailItem>();
				for (int k = 0; k < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail.Length"); k++) {
					MessageDetailItem messageDetailItem = new MessageDetailItem();
					messageDetailItem.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ k +"].Key"));
					messageDetailItem.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ k +"].Value"));

					messageDetail.add(messageDetailItem);
				}
				envExecutableEntityWithResult.setMessageDetail(messageDetail);

				List<MessageParamsItem> messageParams = new ArrayList<MessageParamsItem>();
				for (int k = 0; k < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams.Length"); k++) {
					MessageParamsItem messageParamsItem = new MessageParamsItem();
					messageParamsItem.setData(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams["+ k +"].Data"));

					messageParams.add(messageParamsItem);
				}
				envExecutableEntityWithResult.setMessageParams(messageParams);
				transitableWithStateEntity.setEnvExecutableEntityWithResult(envExecutableEntityWithResult);
				entityRelation.setTransitableWithStateEntity(transitableWithStateEntity);
				tasksItem.setEntityRelation(entityRelation);

				List<ContextItem> context = new ArrayList<ContextItem>();
				for (int k = 0; k < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].Context.Length"); k++) {
					ContextItem contextItem = new ContextItem();
					contextItem.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].Context["+ k +"].Key"));
					contextItem.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PostDeploymentArrangements["+ i +"].Tasks["+ j +"].Context["+ k +"].Value"));

					context.add(contextItem);
				}
				tasksItem.setContext(context);

				tasks.add(tasksItem);
			}
			postDeploymentArrangementsItem.setTasks(tasks);

			postDeploymentArrangements.add(postDeploymentArrangementsItem);
		}
		data.setPostDeploymentArrangements(postDeploymentArrangements);

		List<PreDeploymentArrangementsItem> preDeploymentArrangements = new ArrayList<PreDeploymentArrangementsItem>();
		for (int i = 0; i < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements.Length"); i++) {
			PreDeploymentArrangementsItem preDeploymentArrangementsItem = new PreDeploymentArrangementsItem();

			OpsGenericArrangement11 opsGenericArrangement11 = new OpsGenericArrangement11();
			opsGenericArrangement11.setArrangementType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.ArrangementType"));
			opsGenericArrangement11.setName(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.Name"));
			opsGenericArrangement11.setServiceGroupCollectionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.ServiceGroupCollectionId"));

			OpsGenericEntityRelation27 opsGenericEntityRelation27 = new OpsGenericEntityRelation27();
			opsGenericEntityRelation27.setParentEntityType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.ParentEntityType"));
			opsGenericEntityRelation27.setParentId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.ParentId"));
			opsGenericEntityRelation27.setProcessDefinitionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.ProcessDefinitionId"));

			TransitableWithStateEntity32 transitableWithStateEntity32 = new TransitableWithStateEntity32();
			transitableWithStateEntity32.setState(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.State"));

			EnvExecutableEntityWithResult33 envExecutableEntityWithResult33 = new EnvExecutableEntityWithResult33();

			EnvExecutableEntity34 envExecutableEntity34 = new EnvExecutableEntity34();
			envExecutableEntity34.setFinishedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.FinishedTime"));
			envExecutableEntity34.setStandaloneExecutable(_ctx.booleanValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StandaloneExecutable"));
			envExecutableEntity34.setStartedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StartedTime"));

			EnvEntity40 envEntity40 = new EnvEntity40();
			envEntity40.setRegionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RegionId"));
			envEntity40.setRunEnv(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RunEnv"));
			envEntity40.setTenantId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.TenantId"));
			envEntity40.setWorkspaceId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.WorkspaceId"));

			Entity41 entity41 = new Entity41();
			entity41.setCreatedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.CreatedTime"));
			entity41.setId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.Id"));
			entity41.setModifiedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.ModifiedTime"));
			envEntity40.setEntity41(entity41);
			envExecutableEntity34.setEnvEntity40(envEntity40);
			envExecutableEntityWithResult33.setEnvExecutableEntity34(envExecutableEntity34);

			ErrorCode35 errorCode35 = new ErrorCode35();
			errorCode35.setExceptionCode(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.ExceptionCode"));
			errorCode35.setLevel(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Level"));
			errorCode35.setPrefix(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Prefix"));
			errorCode35.setScene(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Scene"));
			errorCode35.setType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Type"));
			errorCode35.setVersion(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Version"));
			envExecutableEntityWithResult33.setErrorCode35(errorCode35);

			List<MessageDetailItem38> messageDetail36 = new ArrayList<MessageDetailItem38>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail.Length"); j++) {
				MessageDetailItem38 messageDetailItem38 = new MessageDetailItem38();
				messageDetailItem38.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ j +"].Key"));
				messageDetailItem38.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ j +"].Value"));

				messageDetail36.add(messageDetailItem38);
			}
			envExecutableEntityWithResult33.setMessageDetail36(messageDetail36);

			List<MessageParamsItem39> messageParams37 = new ArrayList<MessageParamsItem39>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams.Length"); j++) {
				MessageParamsItem39 messageParamsItem39 = new MessageParamsItem39();
				messageParamsItem39.setData(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams["+ j +"].Data"));

				messageParams37.add(messageParamsItem39);
			}
			envExecutableEntityWithResult33.setMessageParams37(messageParams37);
			transitableWithStateEntity32.setEnvExecutableEntityWithResult33(envExecutableEntityWithResult33);
			opsGenericEntityRelation27.setTransitableWithStateEntity32(transitableWithStateEntity32);
			opsGenericArrangement11.setOpsGenericEntityRelation27(opsGenericEntityRelation27);

			List<ActionTypesItem30> actionTypes28 = new ArrayList<ActionTypesItem30>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.ActionTypes.Length"); j++) {
				ActionTypesItem30 actionTypesItem30 = new ActionTypesItem30();
				actionTypesItem30.setData(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.ActionTypes["+ j +"].Data"));

				actionTypes28.add(actionTypesItem30);
			}
			opsGenericArrangement11.setActionTypes28(actionTypes28);

			List<OpsGenericEnvConfigItem31> opsGenericEnvConfig29 = new ArrayList<OpsGenericEnvConfigItem31>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEnvConfig.Length"); j++) {
				OpsGenericEnvConfigItem31 opsGenericEnvConfigItem31 = new OpsGenericEnvConfigItem31();
				opsGenericEnvConfigItem31.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEnvConfig["+ j +"].Key"));
				opsGenericEnvConfigItem31.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].OpsGenericArrangement.OpsGenericEnvConfig["+ j +"].Value"));

				opsGenericEnvConfig29.add(opsGenericEnvConfigItem31);
			}
			opsGenericArrangement11.setOpsGenericEnvConfig29(opsGenericEnvConfig29);
			preDeploymentArrangementsItem.setOpsGenericArrangement11(opsGenericArrangement11);

			List<TasksItem13> tasks12 = new ArrayList<TasksItem13>();
			for (int j = 0; j < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks.Length"); j++) {
				TasksItem13 tasksItem13 = new TasksItem13();
				tasksItem13.setActionHandlerCode(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].ActionHandlerCode"));
				tasksItem13.setArrangementId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].ArrangementId"));
				tasksItem13.setServiceGroupCollectionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].ServiceGroupCollectionId"));
				tasksItem13.setServiceGroupId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].ServiceGroupId"));
				tasksItem13.setServiceId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].ServiceId"));

				EntityRelation14 entityRelation14 = new EntityRelation14();
				entityRelation14.setParentEntityType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.ParentEntityType"));
				entityRelation14.setParentId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.ParentId"));
				entityRelation14.setProcessDefinitionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.ProcessDefinitionId"));

				TransitableWithStateEntity17 transitableWithStateEntity17 = new TransitableWithStateEntity17();
				transitableWithStateEntity17.setState(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.State"));

				EnvExecutableEntityWithResult18 envExecutableEntityWithResult18 = new EnvExecutableEntityWithResult18();

				EnvExecutableEntity19 envExecutableEntity19 = new EnvExecutableEntity19();
				envExecutableEntity19.setFinishedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.FinishedTime"));
				envExecutableEntity19.setStandaloneExecutable(_ctx.booleanValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StandaloneExecutable"));
				envExecutableEntity19.setStartedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StartedTime"));

				EnvEntity25 envEntity25 = new EnvEntity25();
				envEntity25.setRegionId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RegionId"));
				envEntity25.setRunEnv(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RunEnv"));
				envEntity25.setTenantId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.TenantId"));
				envEntity25.setWorkspaceId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.WorkspaceId"));

				Entity26 entity26 = new Entity26();
				entity26.setCreatedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.CreatedTime"));
				entity26.setId(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.Id"));
				entity26.setModifiedTime(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.ModifiedTime"));
				envEntity25.setEntity26(entity26);
				envExecutableEntity19.setEnvEntity25(envEntity25);
				envExecutableEntityWithResult18.setEnvExecutableEntity19(envExecutableEntity19);

				ErrorCode20 errorCode20 = new ErrorCode20();
				errorCode20.setExceptionCode(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.ExceptionCode"));
				errorCode20.setLevel(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Level"));
				errorCode20.setPrefix(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Prefix"));
				errorCode20.setScene(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Scene"));
				errorCode20.setType(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Type"));
				errorCode20.setVersion(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Version"));
				envExecutableEntityWithResult18.setErrorCode20(errorCode20);

				List<MessageDetailItem23> messageDetail21 = new ArrayList<MessageDetailItem23>();
				for (int k = 0; k < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail.Length"); k++) {
					MessageDetailItem23 messageDetailItem23 = new MessageDetailItem23();
					messageDetailItem23.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ k +"].Key"));
					messageDetailItem23.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ k +"].Value"));

					messageDetail21.add(messageDetailItem23);
				}
				envExecutableEntityWithResult18.setMessageDetail21(messageDetail21);

				List<MessageParamsItem24> messageParams22 = new ArrayList<MessageParamsItem24>();
				for (int k = 0; k < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams.Length"); k++) {
					MessageParamsItem24 messageParamsItem24 = new MessageParamsItem24();
					messageParamsItem24.setData(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams["+ k +"].Data"));

					messageParams22.add(messageParamsItem24);
				}
				envExecutableEntityWithResult18.setMessageParams22(messageParams22);
				transitableWithStateEntity17.setEnvExecutableEntityWithResult18(envExecutableEntityWithResult18);
				entityRelation14.setTransitableWithStateEntity17(transitableWithStateEntity17);
				tasksItem13.setEntityRelation14(entityRelation14);

				List<ContextItem16> context15 = new ArrayList<ContextItem16>();
				for (int k = 0; k < _ctx.lengthValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].Context.Length"); k++) {
					ContextItem16 contextItem16 = new ContextItem16();
					contextItem16.setKey(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].Context["+ k +"].Key"));
					contextItem16.setValue(_ctx.stringValue("ReinitAKSOpsContainerServiceResponse.Data.PreDeploymentArrangements["+ i +"].Tasks["+ j +"].Context["+ k +"].Value"));

					context15.add(contextItem16);
				}
				tasksItem13.setContext15(context15);

				tasks12.add(tasksItem13);
			}
			preDeploymentArrangementsItem.setTasks12(tasks12);

			preDeploymentArrangements.add(preDeploymentArrangementsItem);
		}
		data.setPreDeploymentArrangements(preDeploymentArrangements);
		reinitAKSOpsContainerServiceResponse.setData(data);
	 
	 	return reinitAKSOpsContainerServiceResponse;
	}
}