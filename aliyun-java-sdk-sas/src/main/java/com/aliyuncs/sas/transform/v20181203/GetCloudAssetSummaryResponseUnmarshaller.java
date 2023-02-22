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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetCloudAssetSummaryResponse;
import com.aliyuncs.sas.model.v20181203.GetCloudAssetSummaryResponse.GroupedFields;
import com.aliyuncs.sas.model.v20181203.GetCloudAssetSummaryResponse.GroupedFields.CloudAssetSummaryMetasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCloudAssetSummaryResponseUnmarshaller {

	public static GetCloudAssetSummaryResponse unmarshall(GetCloudAssetSummaryResponse getCloudAssetSummaryResponse, UnmarshallerContext _ctx) {
		
		getCloudAssetSummaryResponse.setRequestId(_ctx.stringValue("GetCloudAssetSummaryResponse.RequestId"));

		GroupedFields groupedFields = new GroupedFields();
		groupedFields.setInstanceCountTotal(_ctx.integerValue("GetCloudAssetSummaryResponse.GroupedFields.InstanceCountTotal"));
		groupedFields.setInstanceRiskCountTotal(_ctx.integerValue("GetCloudAssetSummaryResponse.GroupedFields.InstanceRiskCountTotal"));

		List<CloudAssetSummaryMetasItem> cloudAssetSummaryMetas = new ArrayList<CloudAssetSummaryMetasItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCloudAssetSummaryResponse.GroupedFields.CloudAssetSummaryMetas.Length"); i++) {
			CloudAssetSummaryMetasItem cloudAssetSummaryMetasItem = new CloudAssetSummaryMetasItem();
			cloudAssetSummaryMetasItem.setAssetType(_ctx.integerValue("GetCloudAssetSummaryResponse.GroupedFields.CloudAssetSummaryMetas["+ i +"].AssetType"));
			cloudAssetSummaryMetasItem.setAssetSubType(_ctx.integerValue("GetCloudAssetSummaryResponse.GroupedFields.CloudAssetSummaryMetas["+ i +"].AssetSubType"));
			cloudAssetSummaryMetasItem.setInstanceCount(_ctx.integerValue("GetCloudAssetSummaryResponse.GroupedFields.CloudAssetSummaryMetas["+ i +"].InstanceCount"));
			cloudAssetSummaryMetasItem.setInstanceRiskCount(_ctx.integerValue("GetCloudAssetSummaryResponse.GroupedFields.CloudAssetSummaryMetas["+ i +"].InstanceRiskCount"));

			cloudAssetSummaryMetas.add(cloudAssetSummaryMetasItem);
		}
		groupedFields.setCloudAssetSummaryMetas(cloudAssetSummaryMetas);
		getCloudAssetSummaryResponse.setGroupedFields(groupedFields);
	 
	 	return getCloudAssetSummaryResponse;
	}
}