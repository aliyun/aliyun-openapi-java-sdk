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

package com.aliyuncs.brain_industrial.transform.v20200920;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brain_industrial.model.v20200920.ListAivppResourcesResponse;
import com.aliyuncs.brain_industrial.model.v20200920.ListAivppResourcesResponse.AivppResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAivppResourcesResponseUnmarshaller {

	public static ListAivppResourcesResponse unmarshall(ListAivppResourcesResponse listAivppResourcesResponse, UnmarshallerContext _ctx) {
		
		listAivppResourcesResponse.setRequestId(_ctx.stringValue("ListAivppResourcesResponse.RequestId"));
		listAivppResourcesResponse.setSuccess(_ctx.stringValue("ListAivppResourcesResponse.Success"));
		listAivppResourcesResponse.setCode(_ctx.stringValue("ListAivppResourcesResponse.Code"));
		listAivppResourcesResponse.setMessage(_ctx.stringValue("ListAivppResourcesResponse.Message"));
		listAivppResourcesResponse.setMaxResults(_ctx.integerValue("ListAivppResourcesResponse.MaxResults"));
		listAivppResourcesResponse.setNextToken(_ctx.stringValue("ListAivppResourcesResponse.NextToken"));
		listAivppResourcesResponse.setTotalCount(_ctx.integerValue("ListAivppResourcesResponse.TotalCount"));

		List<AivppResource> data = new ArrayList<AivppResource>();
		for (int i = 0; i < _ctx.lengthValue("ListAivppResourcesResponse.Data.Length"); i++) {
			AivppResource aivppResource = new AivppResource();
			aivppResource.setId(_ctx.longValue("ListAivppResourcesResponse.Data["+ i +"].Id"));
			aivppResource.setInstanceId(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].InstanceId"));
			aivppResource.setSpecification(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].Specification"));
			aivppResource.setOrderId(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].OrderId"));
			aivppResource.setUserId(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].UserId"));
			aivppResource.setQuantity(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].Quantity"));
			aivppResource.setLeftQuantity(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].LeftQuantity"));
			aivppResource.setStatus(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].Status"));
			aivppResource.setStartTime(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].StartTime"));
			aivppResource.setExpireTime(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].ExpireTime"));
			aivppResource.setGmtCreate(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].GmtCreate"));
			aivppResource.setGmtModified(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].GmtModified"));
			aivppResource.setIsDeleted(_ctx.integerValue("ListAivppResourcesResponse.Data["+ i +"].IsDeleted"));
			aivppResource.setInstanceType(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].InstanceType"));
			aivppResource.setDetail(_ctx.stringValue("ListAivppResourcesResponse.Data["+ i +"].Detail"));

			data.add(aivppResource);
		}
		listAivppResourcesResponse.setData(data);
	 
	 	return listAivppResourcesResponse;
	}
}