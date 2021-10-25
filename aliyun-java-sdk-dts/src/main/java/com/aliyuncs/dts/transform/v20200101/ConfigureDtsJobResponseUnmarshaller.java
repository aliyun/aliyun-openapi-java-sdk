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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.ConfigureDtsJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfigureDtsJobResponseUnmarshaller {

	public static ConfigureDtsJobResponse unmarshall(ConfigureDtsJobResponse configureDtsJobResponse, UnmarshallerContext _ctx) {
		
		configureDtsJobResponse.setRequestId(_ctx.stringValue("ConfigureDtsJobResponse.RequestId"));
		configureDtsJobResponse.setErrCode(_ctx.stringValue("ConfigureDtsJobResponse.ErrCode"));
		configureDtsJobResponse.setErrMessage(_ctx.stringValue("ConfigureDtsJobResponse.ErrMessage"));
		configureDtsJobResponse.setHttpStatusCode(_ctx.stringValue("ConfigureDtsJobResponse.HttpStatusCode"));
		configureDtsJobResponse.setDtsJobId(_ctx.stringValue("ConfigureDtsJobResponse.DtsJobId"));
		configureDtsJobResponse.setSuccess(_ctx.stringValue("ConfigureDtsJobResponse.Success"));
		configureDtsJobResponse.setDtsInstanceId(_ctx.stringValue("ConfigureDtsJobResponse.DtsInstanceId"));
	 
	 	return configureDtsJobResponse;
	}
}