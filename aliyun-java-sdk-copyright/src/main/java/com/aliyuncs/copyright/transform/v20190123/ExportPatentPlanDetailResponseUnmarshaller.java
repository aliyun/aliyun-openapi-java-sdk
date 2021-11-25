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

package com.aliyuncs.copyright.transform.v20190123;

import com.aliyuncs.copyright.model.v20190123.ExportPatentPlanDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportPatentPlanDetailResponseUnmarshaller {

	public static ExportPatentPlanDetailResponse unmarshall(ExportPatentPlanDetailResponse exportPatentPlanDetailResponse, UnmarshallerContext _ctx) {
		
		exportPatentPlanDetailResponse.setRequestId(_ctx.stringValue("ExportPatentPlanDetailResponse.RequestId"));
		exportPatentPlanDetailResponse.setData(_ctx.stringValue("ExportPatentPlanDetailResponse.Data"));
		exportPatentPlanDetailResponse.setSuccess(_ctx.booleanValue("ExportPatentPlanDetailResponse.Success"));
	 
	 	return exportPatentPlanDetailResponse;
	}
}