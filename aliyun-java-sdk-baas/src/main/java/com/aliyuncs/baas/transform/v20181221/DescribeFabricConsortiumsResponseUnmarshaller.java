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

import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumsResponse.ResultItem;
import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumsResponse.ResultItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricConsortiumsResponseUnmarshaller {

	public static DescribeFabricConsortiumsResponse unmarshall(DescribeFabricConsortiumsResponse describeFabricConsortiumsResponse, UnmarshallerContext _ctx) {
		
		describeFabricConsortiumsResponse.setRequestId(_ctx.stringValue("DescribeFabricConsortiumsResponse.RequestId"));
		describeFabricConsortiumsResponse.setErrorCode(_ctx.integerValue("DescribeFabricConsortiumsResponse.ErrorCode"));
		describeFabricConsortiumsResponse.setSuccess(_ctx.booleanValue("DescribeFabricConsortiumsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricConsortiumsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setChannelCount(_ctx.integerValue("DescribeFabricConsortiumsResponse.Result["+ i +"].ChannelCount"));
			resultItem.setChannelPolicy(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].ChannelPolicy"));
			resultItem.setCodeName(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].CodeName"));
			resultItem.setConsortiumId(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].ConsortiumId"));
			resultItem.setConsortiumName(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].ConsortiumName"));
			resultItem.setCreateTime(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].CreateTime"));
			resultItem.setDomain(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].Domain"));
			resultItem.setExpiredTime(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].ExpiredTime"));
			resultItem.setOrganizationCount(_ctx.integerValue("DescribeFabricConsortiumsResponse.Result["+ i +"].OrganizationCount"));
			resultItem.setOwnerBid(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].OwnerBid"));
			resultItem.setOwnerName(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].OwnerName"));
			resultItem.setOwnerUid(_ctx.longValue("DescribeFabricConsortiumsResponse.Result["+ i +"].OwnerUid"));
			resultItem.setRegionId(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].RegionId"));
			resultItem.setRequestId(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].RequestId"));
			resultItem.setSpecName(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].SpecName"));
			resultItem.setState(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].State"));
			resultItem.setSupportChannelConfig(_ctx.booleanValue("DescribeFabricConsortiumsResponse.Result["+ i +"].SupportChannelConfig"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFabricConsortiumsResponse.Result["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("DescribeFabricConsortiumsResponse.Result["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			resultItem.setTags(tags);

			result.add(resultItem);
		}
		describeFabricConsortiumsResponse.setResult(result);
	 
	 	return describeFabricConsortiumsResponse;
	}
}