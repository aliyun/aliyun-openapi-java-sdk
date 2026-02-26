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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.DescribeSuppressedChecksResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeSuppressedChecksResponse.ResourceCheck;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuppressedChecksResponseUnmarshaller {

	public static DescribeSuppressedChecksResponse unmarshall(DescribeSuppressedChecksResponse describeSuppressedChecksResponse, UnmarshallerContext _ctx) {
		
		describeSuppressedChecksResponse.setRequestId(_ctx.stringValue("DescribeSuppressedChecksResponse.RequestId"));

		List<ResourceCheck> data = new ArrayList<ResourceCheck>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSuppressedChecksResponse.Data.Length"); i++) {
			ResourceCheck resourceCheck = new ResourceCheck();
			resourceCheck.setGmtCreated(_ctx.stringValue("DescribeSuppressedChecksResponse.Data["+ i +"].GmtCreated"));
			resourceCheck.setDisabled(_ctx.booleanValue("DescribeSuppressedChecksResponse.Data["+ i +"].Disabled"));
			resourceCheck.setCheckId(_ctx.stringValue("DescribeSuppressedChecksResponse.Data["+ i +"].CheckId"));
			resourceCheck.setGmtModified(_ctx.stringValue("DescribeSuppressedChecksResponse.Data["+ i +"].GmtModified"));
			resourceCheck.setResourceId(_ctx.stringValue("DescribeSuppressedChecksResponse.Data["+ i +"].ResourceId"));

			data.add(resourceCheck);
		}
		describeSuppressedChecksResponse.setData(data);
	 
	 	return describeSuppressedChecksResponse;
	}
}