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

import com.aliyuncs.sas.model.v20181203.DescribeFrontVulPatchListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeFrontVulPatchListResponse.FrontPatch;
import com.aliyuncs.sas.model.v20181203.DescribeFrontVulPatchListResponse.FrontPatch.Patch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFrontVulPatchListResponseUnmarshaller {

	public static DescribeFrontVulPatchListResponse unmarshall(DescribeFrontVulPatchListResponse describeFrontVulPatchListResponse, UnmarshallerContext _ctx) {
		
		describeFrontVulPatchListResponse.setRequestId(_ctx.stringValue("DescribeFrontVulPatchListResponse.RequestId"));

		List<FrontPatch> frontPatchList = new ArrayList<FrontPatch>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFrontVulPatchListResponse.FrontPatchList.Length"); i++) {
			FrontPatch frontPatch = new FrontPatch();
			frontPatch.setUuid(_ctx.stringValue("DescribeFrontVulPatchListResponse.FrontPatchList["+ i +"].Uuid"));

			List<Patch> patchList = new ArrayList<Patch>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFrontVulPatchListResponse.FrontPatchList["+ i +"].PatchList.Length"); j++) {
				Patch patch = new Patch();
				patch.setName(_ctx.stringValue("DescribeFrontVulPatchListResponse.FrontPatchList["+ i +"].PatchList["+ j +"].Name"));
				patch.setAliasName(_ctx.stringValue("DescribeFrontVulPatchListResponse.FrontPatchList["+ i +"].PatchList["+ j +"].AliasName"));

				patchList.add(patch);
			}
			frontPatch.setPatchList(patchList);

			frontPatchList.add(frontPatch);
		}
		describeFrontVulPatchListResponse.setFrontPatchList(frontPatchList);
	 
	 	return describeFrontVulPatchListResponse;
	}
}