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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.DescribeFolderListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeFolderListResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFolderListResponseUnmarshaller {

	public static DescribeFolderListResponse unmarshall(DescribeFolderListResponse describeFolderListResponse, UnmarshallerContext _ctx) {
		
		describeFolderListResponse.setRequestId(_ctx.stringValue("DescribeFolderListResponse.RequestId"));
		describeFolderListResponse.setSuccess(_ctx.booleanValue("DescribeFolderListResponse.Success"));
		describeFolderListResponse.setCode(_ctx.integerValue("DescribeFolderListResponse.Code"));
		describeFolderListResponse.setMessage(_ctx.stringValue("DescribeFolderListResponse.Message"));
		describeFolderListResponse.setPageNumber(_ctx.integerValue("DescribeFolderListResponse.PageNumber"));
		describeFolderListResponse.setPageSize(_ctx.integerValue("DescribeFolderListResponse.PageSize"));
		describeFolderListResponse.setTotal(_ctx.integerValue("DescribeFolderListResponse.Total"));

		Resource resource = new Resource();
		resource.setName(_ctx.stringValue("DescribeFolderListResponse.Resource.Name"));
		resource.setServiceId(_ctx.longValue("DescribeFolderListResponse.Resource.ServiceId"));
		describeFolderListResponse.setResource(resource);
	 
	 	return describeFolderListResponse;
	}
}