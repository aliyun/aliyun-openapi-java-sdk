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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.GetOpsCommandDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOpsCommandDetailResponseUnmarshaller {

	public static GetOpsCommandDetailResponse unmarshall(GetOpsCommandDetailResponse getOpsCommandDetailResponse, UnmarshallerContext _ctx) {
		
		getOpsCommandDetailResponse.setRequestId(_ctx.stringValue("GetOpsCommandDetailResponse.RequestId"));
		getOpsCommandDetailResponse.setId(_ctx.longValue("GetOpsCommandDetailResponse.Id"));
		getOpsCommandDetailResponse.setName(_ctx.stringValue("GetOpsCommandDetailResponse.Name"));
		getOpsCommandDetailResponse.setDescription(_ctx.stringValue("GetOpsCommandDetailResponse.Description"));
		getOpsCommandDetailResponse.setTargetType(_ctx.stringValue("GetOpsCommandDetailResponse.TargetType"));
		getOpsCommandDetailResponse.setServiceName(_ctx.stringValue("GetOpsCommandDetailResponse.ServiceName"));
		getOpsCommandDetailResponse.setCategory(_ctx.stringValue("GetOpsCommandDetailResponse.Category"));
		getOpsCommandDetailResponse.setParams(_ctx.stringValue("GetOpsCommandDetailResponse.Params"));
	 
	 	return getOpsCommandDetailResponse;
	}
}