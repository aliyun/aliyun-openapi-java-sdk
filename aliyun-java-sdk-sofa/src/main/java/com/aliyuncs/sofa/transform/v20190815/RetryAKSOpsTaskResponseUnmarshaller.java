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

import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse;
import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse.Data;
import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse.Data.ContextItem;
import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse.Data.EntityRelation;
import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity;
import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult;
import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity;
import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity;
import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity;
import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode;
import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetailItem;
import com.aliyuncs.sofa.model.v20190815.RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetryAKSOpsTaskResponseUnmarshaller {

	public static RetryAKSOpsTaskResponse unmarshall(RetryAKSOpsTaskResponse retryAKSOpsTaskResponse, UnmarshallerContext _ctx) {
		
		retryAKSOpsTaskResponse.setRequestId(_ctx.stringValue("RetryAKSOpsTaskResponse.RequestId"));
		retryAKSOpsTaskResponse.setResultCode(_ctx.stringValue("RetryAKSOpsTaskResponse.ResultCode"));
		retryAKSOpsTaskResponse.setResultMessage(_ctx.stringValue("RetryAKSOpsTaskResponse.ResultMessage"));

		Data data = new Data();
		data.setActionHandlerCode(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.ActionHandlerCode"));
		data.setArrangementId(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.ArrangementId"));
		data.setServiceGroupCollectionId(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.ServiceGroupCollectionId"));
		data.setServiceGroupId(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.ServiceGroupId"));
		data.setServiceId(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.ServiceId"));

		EntityRelation entityRelation = new EntityRelation();
		entityRelation.setParentEntityType(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.ParentEntityType"));
		entityRelation.setParentId(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.ParentId"));
		entityRelation.setProcessDefinitionId(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.ProcessDefinitionId"));

		TransitableWithStateEntity transitableWithStateEntity = new TransitableWithStateEntity();
		transitableWithStateEntity.setState(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.State"));

		EnvExecutableEntityWithResult envExecutableEntityWithResult = new EnvExecutableEntityWithResult();

		EnvExecutableEntity envExecutableEntity = new EnvExecutableEntity();
		envExecutableEntity.setFinishedTime(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.FinishedTime"));
		envExecutableEntity.setStandaloneExecutable(_ctx.booleanValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StandaloneExecutable"));
		envExecutableEntity.setStartedTime(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StartedTime"));

		EnvEntity envEntity = new EnvEntity();
		envEntity.setRegionId(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RegionId"));
		envEntity.setRunEnv(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RunEnv"));
		envEntity.setTenantId(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.TenantId"));
		envEntity.setWorkspaceId(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.WorkspaceId"));

		Entity entity = new Entity();
		entity.setCreatedTime(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.CreatedTime"));
		entity.setId(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.Id"));
		entity.setModifiedTime(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.ModifiedTime"));
		envEntity.setEntity(entity);
		envExecutableEntity.setEnvEntity(envEntity);
		envExecutableEntityWithResult.setEnvExecutableEntity(envExecutableEntity);

		ErrorCode errorCode = new ErrorCode();
		errorCode.setExceptionCode(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.ExceptionCode"));
		errorCode.setLevel(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Level"));
		errorCode.setPrefix(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Prefix"));
		errorCode.setScene(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Scene"));
		errorCode.setType(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Type"));
		errorCode.setVersion(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Version"));
		envExecutableEntityWithResult.setErrorCode(errorCode);

		List<MessageDetailItem> messageDetail = new ArrayList<MessageDetailItem>();
		for (int i = 0; i < _ctx.lengthValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail.Length"); i++) {
			MessageDetailItem messageDetailItem = new MessageDetailItem();
			messageDetailItem.setKey(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ i +"].Key"));
			messageDetailItem.setValue(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetail["+ i +"].Value"));

			messageDetail.add(messageDetailItem);
		}
		envExecutableEntityWithResult.setMessageDetail(messageDetail);

		List<MessageParamsItem> messageParams = new ArrayList<MessageParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams.Length"); i++) {
			MessageParamsItem messageParamsItem = new MessageParamsItem();
			messageParamsItem.setData(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.EntityRelation.TransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams["+ i +"].Data"));

			messageParams.add(messageParamsItem);
		}
		envExecutableEntityWithResult.setMessageParams(messageParams);
		transitableWithStateEntity.setEnvExecutableEntityWithResult(envExecutableEntityWithResult);
		entityRelation.setTransitableWithStateEntity(transitableWithStateEntity);
		data.setEntityRelation(entityRelation);

		List<ContextItem> context = new ArrayList<ContextItem>();
		for (int i = 0; i < _ctx.lengthValue("RetryAKSOpsTaskResponse.Data.Context.Length"); i++) {
			ContextItem contextItem = new ContextItem();
			contextItem.setKey(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.Context["+ i +"].Key"));
			contextItem.setValue(_ctx.stringValue("RetryAKSOpsTaskResponse.Data.Context["+ i +"].Value"));

			context.add(contextItem);
		}
		data.setContext(context);
		retryAKSOpsTaskResponse.setData(data);
	 
	 	return retryAKSOpsTaskResponse;
	}
}