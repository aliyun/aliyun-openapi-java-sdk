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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.ListSubscriptionByPackageResponse;
import com.aliyuncs.retailbot.model.v20210224.ListSubscriptionByPackageResponse.PageData;
import com.aliyuncs.retailbot.model.v20210224.ListSubscriptionByPackageResponse.PageData.PackageDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubscriptionByPackageResponseUnmarshaller {

	public static ListSubscriptionByPackageResponse unmarshall(ListSubscriptionByPackageResponse listSubscriptionByPackageResponse, UnmarshallerContext _ctx) {
		
		listSubscriptionByPackageResponse.setRequestId(_ctx.stringValue("ListSubscriptionByPackageResponse.RequestId"));
		listSubscriptionByPackageResponse.setSuccess(_ctx.booleanValue("ListSubscriptionByPackageResponse.Success"));
		listSubscriptionByPackageResponse.setCode(_ctx.stringValue("ListSubscriptionByPackageResponse.Code"));
		listSubscriptionByPackageResponse.setMessage(_ctx.stringValue("ListSubscriptionByPackageResponse.Message"));

		PageData pageData = new PageData();
		pageData.setMaxResults(_ctx.integerValue("ListSubscriptionByPackageResponse.PageData.MaxResults"));
		pageData.setNextToken(_ctx.stringValue("ListSubscriptionByPackageResponse.PageData.NextToken"));
		pageData.setTotalCount(_ctx.integerValue("ListSubscriptionByPackageResponse.PageData.TotalCount"));

		List<PackageDTO> data = new ArrayList<PackageDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListSubscriptionByPackageResponse.PageData.Data.Length"); i++) {
			PackageDTO packageDTO = new PackageDTO();
			packageDTO.setRobotCode(_ctx.stringValue("ListSubscriptionByPackageResponse.PageData.Data["+ i +"].RobotCode"));
			packageDTO.setPackageCode(_ctx.stringValue("ListSubscriptionByPackageResponse.PageData.Data["+ i +"].PackageCode"));
			packageDTO.setPackageVersion(_ctx.stringValue("ListSubscriptionByPackageResponse.PageData.Data["+ i +"].PackageVersion"));

			data.add(packageDTO);
		}
		pageData.setData(data);
		listSubscriptionByPackageResponse.setPageData(pageData);
	 
	 	return listSubscriptionByPackageResponse;
	}
}