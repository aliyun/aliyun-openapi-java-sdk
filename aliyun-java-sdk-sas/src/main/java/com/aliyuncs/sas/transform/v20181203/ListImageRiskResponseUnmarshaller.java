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

import com.aliyuncs.sas.model.v20181203.ListImageRiskResponse;
import com.aliyuncs.sas.model.v20181203.ListImageRiskResponse.ImageRiskListItem;
import com.aliyuncs.sas.model.v20181203.ListImageRiskResponse.ImageRiskListItem.Endpoint;
import com.aliyuncs.sas.model.v20181203.ListImageRiskResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImageRiskResponseUnmarshaller {

	public static ListImageRiskResponse unmarshall(ListImageRiskResponse listImageRiskResponse, UnmarshallerContext _ctx) {
		
		listImageRiskResponse.setRequestId(_ctx.stringValue("ListImageRiskResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotalCount(_ctx.integerValue("ListImageRiskResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListImageRiskResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("ListImageRiskResponse.PageInfo.PageSize"));
		pageInfo.setCurrentPage(_ctx.integerValue("ListImageRiskResponse.PageInfo.CurrentPage"));
		listImageRiskResponse.setPageInfo(pageInfo);

		List<ImageRiskListItem> imageRiskList = new ArrayList<ImageRiskListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListImageRiskResponse.ImageRiskList.Length"); i++) {
			ImageRiskListItem imageRiskListItem = new ImageRiskListItem();
			imageRiskListItem.setRepoNamespace(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].RepoNamespace"));
			imageRiskListItem.setRepoName(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].RepoName"));
			imageRiskListItem.setTag(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].Tag"));
			imageRiskListItem.setRegionId(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].RegionId"));
			imageRiskListItem.setDigest(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].Digest"));
			imageRiskListItem.setRepoId(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].RepoId"));
			imageRiskListItem.setRepoType(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].RepoType"));
			imageRiskListItem.setRegistryType(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].RegistryType"));
			imageRiskListItem.setEndpoints(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].Endpoints"));
			imageRiskListItem.setImageId(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].ImageId"));
			imageRiskListItem.setTagImmutable(_ctx.integerValue("ListImageRiskResponse.ImageRiskList["+ i +"].TagImmutable"));
			imageRiskListItem.setStatistics(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].Statistics"));
			imageRiskListItem.setImageAccessType(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].ImageAccessType"));
			imageRiskListItem.setImage(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].Image"));
			imageRiskListItem.setUuid(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].Uuid"));
			imageRiskListItem.setInternetURLs(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].InternetURLs"));
			imageRiskListItem.setVpcURLs(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].VpcURLs"));

			List<Endpoint> endPointList = new ArrayList<Endpoint>();
			for (int j = 0; j < _ctx.lengthValue("ListImageRiskResponse.ImageRiskList["+ i +"].EndPointList.Length"); j++) {
				Endpoint endpoint = new Endpoint();
				endpoint.setType(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].EndPointList["+ j +"].Type"));

				List<String> domains = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListImageRiskResponse.ImageRiskList["+ i +"].EndPointList["+ j +"].Domains.Length"); k++) {
					domains.add(_ctx.stringValue("ListImageRiskResponse.ImageRiskList["+ i +"].EndPointList["+ j +"].Domains["+ k +"]"));
				}
				endpoint.setDomains(domains);

				endPointList.add(endpoint);
			}
			imageRiskListItem.setEndPointList(endPointList);

			imageRiskList.add(imageRiskListItem);
		}
		listImageRiskResponse.setImageRiskList(imageRiskList);
	 
	 	return listImageRiskResponse;
	}
}