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

package com.aliyuncs.marketplaceintl.transform.v20220726;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.marketplaceintl.model.v20220726.DescribeInstanceTypesResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeInstanceTypesResponse.Data;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeInstanceTypesResponse.Data.CustomizeFamilyItem;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeInstanceTypesResponse.Data.InstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceTypesResponseUnmarshaller {

	public static DescribeInstanceTypesResponse unmarshall(DescribeInstanceTypesResponse describeInstanceTypesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceTypesResponse.setRequestId(_ctx.stringValue("DescribeInstanceTypesResponse.RequestId"));
		describeInstanceTypesResponse.setErrorCode(_ctx.stringValue("DescribeInstanceTypesResponse.ErrorCode"));
		describeInstanceTypesResponse.setCode(_ctx.integerValue("DescribeInstanceTypesResponse.Code"));
		describeInstanceTypesResponse.setMsg(_ctx.stringValue("DescribeInstanceTypesResponse.Msg"));
		describeInstanceTypesResponse.setSuccess(_ctx.booleanValue("DescribeInstanceTypesResponse.Success"));

		Data data = new Data();
		data.setTrackId(_ctx.stringValue("DescribeInstanceTypesResponse.Data.TrackId"));

		List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTypesResponse.Data.InstanceTypes.Length"); i++) {
			InstanceType instanceType = new InstanceType();
			instanceType.setText(_ctx.stringValue("DescribeInstanceTypesResponse.Data.InstanceTypes["+ i +"].Text"));
			instanceType.setValue(_ctx.stringValue("DescribeInstanceTypesResponse.Data.InstanceTypes["+ i +"].Value"));

			instanceTypes.add(instanceType);
		}
		data.setInstanceTypes(instanceTypes);

		List<CustomizeFamilyItem> customizeFamily = new ArrayList<CustomizeFamilyItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTypesResponse.Data.CustomizeFamily.Length"); i++) {
			CustomizeFamilyItem customizeFamilyItem = new CustomizeFamilyItem();
			customizeFamilyItem.setGlobalKey(_ctx.stringValue("DescribeInstanceTypesResponse.Data.CustomizeFamily["+ i +"].GlobalKey"));
			customizeFamilyItem.setText(_ctx.stringValue("DescribeInstanceTypesResponse.Data.CustomizeFamily["+ i +"].Text"));
			customizeFamilyItem.setValue(_ctx.stringValue("DescribeInstanceTypesResponse.Data.CustomizeFamily["+ i +"].Value"));

			customizeFamily.add(customizeFamilyItem);
		}
		data.setCustomizeFamily(customizeFamily);
		describeInstanceTypesResponse.setData(data);
	 
	 	return describeInstanceTypesResponse;
	}
}