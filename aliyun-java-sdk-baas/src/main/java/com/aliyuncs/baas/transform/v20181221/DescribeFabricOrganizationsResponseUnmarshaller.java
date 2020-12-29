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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationsResponse.ResultItem;
import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationsResponse.ResultItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricOrganizationsResponseUnmarshaller {

	public static DescribeFabricOrganizationsResponse unmarshall(DescribeFabricOrganizationsResponse describeFabricOrganizationsResponse, UnmarshallerContext _ctx) {
		
		describeFabricOrganizationsResponse.setRequestId(_ctx.stringValue("DescribeFabricOrganizationsResponse.RequestId"));
		describeFabricOrganizationsResponse.setErrorCode(_ctx.integerValue("DescribeFabricOrganizationsResponse.ErrorCode"));
		describeFabricOrganizationsResponse.setSuccess(_ctx.booleanValue("DescribeFabricOrganizationsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricOrganizationsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCodeName(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].CodeName"));
			resultItem.setConsortiumCount(_ctx.integerValue("DescribeFabricOrganizationsResponse.Result["+ i +"].ConsortiumCount"));
			resultItem.setCreateTime(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].CreateTime"));
			resultItem.setDomain(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].Domain"));
			resultItem.setOrganizationDescription(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].OrganizationDescription"));
			resultItem.setOrganizationId(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].OrganizationId"));
			resultItem.setOrganizationName(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].OrganizationName"));
			resultItem.setOwnerBid(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].OwnerBid"));
			resultItem.setOwnerName(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].OwnerName"));
			resultItem.setOwnerUid(_ctx.longValue("DescribeFabricOrganizationsResponse.Result["+ i +"].OwnerUid"));
			resultItem.setPeerCount(_ctx.integerValue("DescribeFabricOrganizationsResponse.Result["+ i +"].PeerCount"));
			resultItem.setRegionId(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].RegionId"));
			resultItem.setRequestId(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].RequestId"));
			resultItem.setSpecName(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].SpecName"));
			resultItem.setState(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].State"));
			resultItem.setUserCount(_ctx.integerValue("DescribeFabricOrganizationsResponse.Result["+ i +"].UserCount"));
			resultItem.setZoneId(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].ZoneId"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFabricOrganizationsResponse.Result["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("DescribeFabricOrganizationsResponse.Result["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			resultItem.setTags(tags);

			result.add(resultItem);
		}
		describeFabricOrganizationsResponse.setResult(result);
	 
	 	return describeFabricOrganizationsResponse;
	}
}