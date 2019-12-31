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

package com.aliyuncs.mpserverless.transform.v20190930;

import com.aliyuncs.mpserverless.model.v20190930.DescribeTaobaoSpaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaobaoSpaceResponseUnmarshaller {

	public static DescribeTaobaoSpaceResponse unmarshall(DescribeTaobaoSpaceResponse describeTaobaoSpaceResponse, UnmarshallerContext _ctx) {
		
		describeTaobaoSpaceResponse.setRequestId(_ctx.stringValue("DescribeTaobaoSpaceResponse.RequestId"));
		describeTaobaoSpaceResponse.setHttpStatusCode(_ctx.stringValue("DescribeTaobaoSpaceResponse.HttpStatusCode"));
		describeTaobaoSpaceResponse.setSuccess(_ctx.booleanValue("DescribeTaobaoSpaceResponse.Success"));
		describeTaobaoSpaceResponse.setCode(_ctx.stringValue("DescribeTaobaoSpaceResponse.Code"));
		describeTaobaoSpaceResponse.setMessage(_ctx.stringValue("DescribeTaobaoSpaceResponse.Message"));
		describeTaobaoSpaceResponse.setSpaceId(_ctx.stringValue("DescribeTaobaoSpaceResponse.SpaceId"));
		describeTaobaoSpaceResponse.setName(_ctx.stringValue("DescribeTaobaoSpaceResponse.Name"));
		describeTaobaoSpaceResponse.setDesc(_ctx.stringValue("DescribeTaobaoSpaceResponse.Desc"));
		describeTaobaoSpaceResponse.setCreateTime(_ctx.stringValue("DescribeTaobaoSpaceResponse.CreateTime"));
		describeTaobaoSpaceResponse.setUpdateTime(_ctx.stringValue("DescribeTaobaoSpaceResponse.UpdateTime"));
	 
	 	return describeTaobaoSpaceResponse;
	}
}