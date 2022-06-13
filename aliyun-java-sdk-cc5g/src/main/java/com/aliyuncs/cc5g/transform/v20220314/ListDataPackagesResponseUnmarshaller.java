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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.ListDataPackagesResponse;
import com.aliyuncs.cc5g.model.v20220314.ListDataPackagesResponse.DataPackage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataPackagesResponseUnmarshaller {

	public static ListDataPackagesResponse unmarshall(ListDataPackagesResponse listDataPackagesResponse, UnmarshallerContext _ctx) {
		
		listDataPackagesResponse.setRequestId(_ctx.stringValue("ListDataPackagesResponse.RequestId"));
		listDataPackagesResponse.setNextToken(_ctx.stringValue("ListDataPackagesResponse.NextToken"));
		listDataPackagesResponse.setMaxResults(_ctx.stringValue("ListDataPackagesResponse.MaxResults"));
		listDataPackagesResponse.setTotalCount(_ctx.stringValue("ListDataPackagesResponse.TotalCount"));

		List<DataPackage> dataPackages = new ArrayList<DataPackage>();
		for (int i = 0; i < _ctx.lengthValue("ListDataPackagesResponse.DataPackages.Length"); i++) {
			DataPackage dataPackage = new DataPackage();
			dataPackage.setDataPackageId(_ctx.stringValue("ListDataPackagesResponse.DataPackages["+ i +"].DataPackageId"));
			dataPackage.setStatus(_ctx.stringValue("ListDataPackagesResponse.DataPackages["+ i +"].Status"));
			dataPackage.setName(_ctx.stringValue("ListDataPackagesResponse.DataPackages["+ i +"].Name"));
			dataPackage.setISP(_ctx.stringValue("ListDataPackagesResponse.DataPackages["+ i +"].ISP"));
			dataPackage.setSize(_ctx.stringValue("ListDataPackagesResponse.DataPackages["+ i +"].Size"));
			dataPackage.setCardCount(_ctx.stringValue("ListDataPackagesResponse.DataPackages["+ i +"].CardCount"));
			dataPackage.setCreateTime(_ctx.stringValue("ListDataPackagesResponse.DataPackages["+ i +"].CreateTime"));
			dataPackage.setExpiredTime(_ctx.stringValue("ListDataPackagesResponse.DataPackages["+ i +"].ExpiredTime"));

			dataPackages.add(dataPackage);
		}
		listDataPackagesResponse.setDataPackages(dataPackages);
	 
	 	return listDataPackagesResponse;
	}
}