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

import com.aliyuncs.sofa.model.v20190815.CancelAKSPlanResponse;
import com.aliyuncs.sofa.model.v20190815.CancelAKSPlanResponse.Data;
import com.aliyuncs.sofa.model.v20190815.CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity;
import com.aliyuncs.sofa.model.v20190815.CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult;
import com.aliyuncs.sofa.model.v20190815.CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity;
import com.aliyuncs.sofa.model.v20190815.CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity;
import com.aliyuncs.sofa.model.v20190815.CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity;
import com.aliyuncs.sofa.model.v20190815.CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode;
import com.aliyuncs.sofa.model.v20190815.CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetailsItem;
import com.aliyuncs.sofa.model.v20190815.CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParamsItem;
import com.aliyuncs.sofa.model.v20190815.CancelAKSPlanResponse.Data.ContextItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelAKSPlanResponseUnmarshaller {

	public static CancelAKSPlanResponse unmarshall(CancelAKSPlanResponse cancelAKSPlanResponse, UnmarshallerContext _ctx) {
		
		cancelAKSPlanResponse.setRequestId(_ctx.stringValue("CancelAKSPlanResponse.RequestId"));
		cancelAKSPlanResponse.setResultCode(_ctx.stringValue("CancelAKSPlanResponse.ResultCode"));
		cancelAKSPlanResponse.setResultMessage(_ctx.stringValue("CancelAKSPlanResponse.ResultMessage"));

		Data data = new Data();
		data.setAppCount(_ctx.longValue("CancelAKSPlanResponse.Data.AppCount"));
		data.setAutoExecution(_ctx.booleanValue("CancelAKSPlanResponse.Data.AutoExecution"));
		data.setCreator(_ctx.stringValue("CancelAKSPlanResponse.Data.Creator"));
		data.setCreatorId(_ctx.stringValue("CancelAKSPlanResponse.Data.CreatorId"));
		data.setDescription(_ctx.stringValue("CancelAKSPlanResponse.Data.Description"));
		data.setExecutorId(_ctx.stringValue("CancelAKSPlanResponse.Data.ExecutorId"));
		data.setExecutorName(_ctx.stringValue("CancelAKSPlanResponse.Data.ExecutorName"));
		data.setInitialByTag(_ctx.stringValue("CancelAKSPlanResponse.Data.InitialByTag"));
		data.setLastOperator(_ctx.stringValue("CancelAKSPlanResponse.Data.LastOperator"));
		data.setLastOperatorId(_ctx.stringValue("CancelAKSPlanResponse.Data.LastOperatorId"));
		data.setName(_ctx.stringValue("CancelAKSPlanResponse.Data.Name"));
		data.setOpsType(_ctx.stringValue("CancelAKSPlanResponse.Data.OpsType"));
		data.setTimeSeriesId(_ctx.stringValue("CancelAKSPlanResponse.Data.TimeSeriesId"));

		BaseTransitableWithStateEntity baseTransitableWithStateEntity = new BaseTransitableWithStateEntity();
		baseTransitableWithStateEntity.setState(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.State"));

		EnvExecutableEntityWithResult envExecutableEntityWithResult = new EnvExecutableEntityWithResult();

		EnvExecutableEntity envExecutableEntity = new EnvExecutableEntity();
		envExecutableEntity.setFinishedTime(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.FinishedTime"));
		envExecutableEntity.setStandaloneExecutable(_ctx.booleanValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StandaloneExecutable"));
		envExecutableEntity.setStartedTime(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.StartedTime"));

		EnvEntity envEntity = new EnvEntity();
		envEntity.setRegionId(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RegionId"));
		envEntity.setRunEnv(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.RunEnv"));
		envEntity.setTenantId(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.TenantId"));
		envEntity.setWorkspaceId(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.WorkspaceId"));

		Entity entity = new Entity();
		entity.setCreatedTime(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.CreatedTime"));
		entity.setId(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.Id"));
		entity.setModifiedTime(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.EnvExecutableEntity.EnvEntity.Entity.ModifiedTime"));
		envEntity.setEntity(entity);
		envExecutableEntity.setEnvEntity(envEntity);
		envExecutableEntityWithResult.setEnvExecutableEntity(envExecutableEntity);

		ErrorCode errorCode = new ErrorCode();
		errorCode.setExceptionCode(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.ExceptionCode"));
		errorCode.setLevel(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Level"));
		errorCode.setPrefix(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Prefix"));
		errorCode.setScene(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Scene"));
		errorCode.setType(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Type"));
		errorCode.setVersion(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.ErrorCode.Version"));
		envExecutableEntityWithResult.setErrorCode(errorCode);

		List<MessageDetailsItem> messageDetails = new ArrayList<MessageDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetails.Length"); i++) {
			MessageDetailsItem messageDetailsItem = new MessageDetailsItem();
			messageDetailsItem.setKey(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetails["+ i +"].Key"));
			messageDetailsItem.setValue(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.MessageDetails["+ i +"].Value"));

			messageDetails.add(messageDetailsItem);
		}
		envExecutableEntityWithResult.setMessageDetails(messageDetails);

		List<MessageParamsItem> messageParams = new ArrayList<MessageParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams.Length"); i++) {
			MessageParamsItem messageParamsItem = new MessageParamsItem();
			messageParamsItem.setData(_ctx.stringValue("CancelAKSPlanResponse.Data.BaseTransitableWithStateEntity.EnvExecutableEntityWithResult.MessageParams["+ i +"].Data"));

			messageParams.add(messageParamsItem);
		}
		envExecutableEntityWithResult.setMessageParams(messageParams);
		baseTransitableWithStateEntity.setEnvExecutableEntityWithResult(envExecutableEntityWithResult);
		data.setBaseTransitableWithStateEntity(baseTransitableWithStateEntity);

		List<ContextItem> context = new ArrayList<ContextItem>();
		for (int i = 0; i < _ctx.lengthValue("CancelAKSPlanResponse.Data.Context.Length"); i++) {
			ContextItem contextItem = new ContextItem();
			contextItem.setKey(_ctx.stringValue("CancelAKSPlanResponse.Data.Context["+ i +"].Key"));
			contextItem.setValue(_ctx.stringValue("CancelAKSPlanResponse.Data.Context["+ i +"].Value"));

			context.add(contextItem);
		}
		data.setContext(context);
		cancelAKSPlanResponse.setData(data);
	 
	 	return cancelAKSPlanResponse;
	}
}