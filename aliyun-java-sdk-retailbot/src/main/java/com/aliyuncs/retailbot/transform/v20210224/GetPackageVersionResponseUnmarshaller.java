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

import com.aliyuncs.retailbot.model.v20210224.GetPackageVersionResponse;
import com.aliyuncs.retailbot.model.v20210224.GetPackageVersionResponse.PackageDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPackageVersionResponseUnmarshaller {

	public static GetPackageVersionResponse unmarshall(GetPackageVersionResponse getPackageVersionResponse, UnmarshallerContext _ctx) {
		
		getPackageVersionResponse.setRequestId(_ctx.stringValue("GetPackageVersionResponse.RequestId"));
		getPackageVersionResponse.setPackageName(_ctx.stringValue("GetPackageVersionResponse.PackageName"));
		getPackageVersionResponse.setPackageCode(_ctx.stringValue("GetPackageVersionResponse.PackageCode"));
		getPackageVersionResponse.setSuccess(_ctx.booleanValue("GetPackageVersionResponse.Success"));
		getPackageVersionResponse.setCode(_ctx.stringValue("GetPackageVersionResponse.Code"));
		getPackageVersionResponse.setMessage(_ctx.stringValue("GetPackageVersionResponse.Message"));

		List<PackageDetail> packageDetails = new ArrayList<PackageDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetPackageVersionResponse.PackageDetails.Length"); i++) {
			PackageDetail packageDetail = new PackageDetail();
			packageDetail.setPackageVersion(_ctx.stringValue("GetPackageVersionResponse.PackageDetails["+ i +"].PackageVersion"));
			packageDetail.setPackageDetailDescription(_ctx.stringValue("GetPackageVersionResponse.PackageDetails["+ i +"].PackageDetailDescription"));
			packageDetail.setCreateTime(_ctx.stringValue("GetPackageVersionResponse.PackageDetails["+ i +"].CreateTime"));
			packageDetail.setModifyTime(_ctx.stringValue("GetPackageVersionResponse.PackageDetails["+ i +"].ModifyTime"));
			packageDetail.setCreateUserId(_ctx.stringValue("GetPackageVersionResponse.PackageDetails["+ i +"].CreateUserId"));
			packageDetail.setModifyUserId(_ctx.stringValue("GetPackageVersionResponse.PackageDetails["+ i +"].ModifyUserId"));
			packageDetail.setPublishTime(_ctx.stringValue("GetPackageVersionResponse.PackageDetails["+ i +"].PublishTime"));

			packageDetails.add(packageDetail);
		}
		getPackageVersionResponse.setPackageDetails(packageDetails);
	 
	 	return getPackageVersionResponse;
	}
}