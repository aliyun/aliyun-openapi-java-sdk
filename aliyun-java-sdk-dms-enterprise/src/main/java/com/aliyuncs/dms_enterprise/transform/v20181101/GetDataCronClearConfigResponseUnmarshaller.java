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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCronClearConfigResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCronClearConfigResponse.DataCronClearConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataCronClearConfigResponseUnmarshaller {

	public static GetDataCronClearConfigResponse unmarshall(GetDataCronClearConfigResponse getDataCronClearConfigResponse, UnmarshallerContext _ctx) {
		
		getDataCronClearConfigResponse.setRequestId(_ctx.stringValue("GetDataCronClearConfigResponse.RequestId"));
		getDataCronClearConfigResponse.setSuccess(_ctx.booleanValue("GetDataCronClearConfigResponse.Success"));
		getDataCronClearConfigResponse.setErrorMessage(_ctx.stringValue("GetDataCronClearConfigResponse.ErrorMessage"));
		getDataCronClearConfigResponse.setErrorCode(_ctx.stringValue("GetDataCronClearConfigResponse.ErrorCode"));

		DataCronClearConfig dataCronClearConfig = new DataCronClearConfig();
		dataCronClearConfig.setCronFormat(_ctx.stringValue("GetDataCronClearConfigResponse.DataCronClearConfig.CronFormat"));
		dataCronClearConfig.setDuration(_ctx.stringValue("GetDataCronClearConfigResponse.DataCronClearConfig.Duration"));
		dataCronClearConfig.setCronStatus(_ctx.stringValue("GetDataCronClearConfigResponse.DataCronClearConfig.CronStatus"));
		dataCronClearConfig.setCronCallTimes(_ctx.stringValue("GetDataCronClearConfigResponse.DataCronClearConfig.CronCallTimes"));
		dataCronClearConfig.setCronLastCallStartTime(_ctx.stringValue("GetDataCronClearConfigResponse.DataCronClearConfig.CronLastCallStartTime"));
		dataCronClearConfig.setCronNextCallTime(_ctx.stringValue("GetDataCronClearConfigResponse.DataCronClearConfig.CronNextCallTime"));
		dataCronClearConfig.setOptimizeTableAfterEveryClearTimes(_ctx.longValue("GetDataCronClearConfigResponse.DataCronClearConfig.OptimizeTableAfterEveryClearTimes"));
		dataCronClearConfig.setCurrentClearTaskCount(_ctx.longValue("GetDataCronClearConfigResponse.DataCronClearConfig.CurrentClearTaskCount"));
		getDataCronClearConfigResponse.setDataCronClearConfig(dataCronClearConfig);
	 
	 	return getDataCronClearConfigResponse;
	}
}