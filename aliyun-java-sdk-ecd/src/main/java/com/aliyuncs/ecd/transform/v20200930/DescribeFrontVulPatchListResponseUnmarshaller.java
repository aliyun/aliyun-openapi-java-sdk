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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeFrontVulPatchListResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeFrontVulPatchListResponse.FrontPatchItem;
import com.aliyuncs.ecd.model.v20200930.DescribeFrontVulPatchListResponse.FrontPatchItem.PatchItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFrontVulPatchListResponseUnmarshaller {

	public static DescribeFrontVulPatchListResponse unmarshall(DescribeFrontVulPatchListResponse describeFrontVulPatchListResponse, UnmarshallerContext _ctx) {
		
		describeFrontVulPatchListResponse.setRequestId(_ctx.stringValue("DescribeFrontVulPatchListResponse.RequestId"));

		List<FrontPatchItem> frontPatchList = new ArrayList<FrontPatchItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFrontVulPatchListResponse.FrontPatchList.Length"); i++) {
			FrontPatchItem frontPatchItem = new FrontPatchItem();
			frontPatchItem.setDesktopId(_ctx.stringValue("DescribeFrontVulPatchListResponse.FrontPatchList["+ i +"].DesktopId"));

			List<PatchItem> patchList = new ArrayList<PatchItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFrontVulPatchListResponse.FrontPatchList["+ i +"].PatchList.Length"); j++) {
				PatchItem patchItem = new PatchItem();
				patchItem.setName(_ctx.stringValue("DescribeFrontVulPatchListResponse.FrontPatchList["+ i +"].PatchList["+ j +"].Name"));
				patchItem.setAliasName(_ctx.stringValue("DescribeFrontVulPatchListResponse.FrontPatchList["+ i +"].PatchList["+ j +"].AliasName"));

				patchList.add(patchItem);
			}
			frontPatchItem.setPatchList(patchList);

			frontPatchList.add(frontPatchItem);
		}
		describeFrontVulPatchListResponse.setFrontPatchList(frontPatchList);
	 
	 	return describeFrontVulPatchListResponse;
	}
}