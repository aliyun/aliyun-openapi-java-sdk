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

package com.aliyuncs.cd.transform.v2021127;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cd.model.v2021127.GetMenuDataStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMenuDataStatusResponseUnmarshaller {

	public static GetMenuDataStatusResponse unmarshall(GetMenuDataStatusResponse getMenuDataStatusResponse, UnmarshallerContext _ctx) {
		
		getMenuDataStatusResponse.setRequestId(_ctx.stringValue("GetMenuDataStatusResponse.RequestId"));
		getMenuDataStatusResponse.setSuccess(_ctx.booleanValue("GetMenuDataStatusResponse.Success"));
		getMenuDataStatusResponse.setMessage(_ctx.stringValue("GetMenuDataStatusResponse.Message"));
		getMenuDataStatusResponse.setCode(_ctx.stringValue("GetMenuDataStatusResponse.Code"));
		getMenuDataStatusResponse.setHttpStatusCode(_ctx.integerValue("GetMenuDataStatusResponse.HttpStatusCode"));
		getMenuDataStatusResponse.setProductContainerId(_ctx.stringValue("GetMenuDataStatusResponse.ProductContainerId"));
		getMenuDataStatusResponse.setBatchId(_ctx.stringValue("GetMenuDataStatusResponse.BatchId"));
		getMenuDataStatusResponse.setTotal(_ctx.longValue("GetMenuDataStatusResponse.Total"));
		getMenuDataStatusResponse.setFailed(_ctx.longValue("GetMenuDataStatusResponse.Failed"));

		List<String> failedProductContainerList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetMenuDataStatusResponse.FailedProductContainerList.Length"); i++) {
			failedProductContainerList.add(_ctx.stringValue("GetMenuDataStatusResponse.FailedProductContainerList["+ i +"]"));
		}
		getMenuDataStatusResponse.setFailedProductContainerList(failedProductContainerList);
	 
	 	return getMenuDataStatusResponse;
	}
}