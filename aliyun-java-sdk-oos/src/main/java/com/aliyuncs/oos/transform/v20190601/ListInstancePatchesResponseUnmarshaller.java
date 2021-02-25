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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListInstancePatchesResponse;
import com.aliyuncs.oos.model.v20190601.ListInstancePatchesResponse.Patch;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancePatchesResponseUnmarshaller {

	public static ListInstancePatchesResponse unmarshall(ListInstancePatchesResponse listInstancePatchesResponse, UnmarshallerContext _ctx) {
		
		listInstancePatchesResponse.setRequestId(_ctx.stringValue("ListInstancePatchesResponse.RequestId"));
		listInstancePatchesResponse.setMaxResults(_ctx.integerValue("ListInstancePatchesResponse.MaxResults"));
		listInstancePatchesResponse.setNextToken(_ctx.stringValue("ListInstancePatchesResponse.NextToken"));

		List<Patch> patches = new ArrayList<Patch>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancePatchesResponse.Patches.Length"); i++) {
			Patch patch = new Patch();
			patch.setClassification(_ctx.stringValue("ListInstancePatchesResponse.Patches["+ i +"].Classification"));
			patch.setInstalledTime(_ctx.stringValue("ListInstancePatchesResponse.Patches["+ i +"].InstalledTime"));
			patch.setKBId(_ctx.stringValue("ListInstancePatchesResponse.Patches["+ i +"].KBId"));
			patch.setSeverity(_ctx.stringValue("ListInstancePatchesResponse.Patches["+ i +"].Severity"));
			patch.setStatus(_ctx.stringValue("ListInstancePatchesResponse.Patches["+ i +"].Status"));
			patch.setTitle(_ctx.stringValue("ListInstancePatchesResponse.Patches["+ i +"].Title"));

			patches.add(patch);
		}
		listInstancePatchesResponse.setPatches(patches);
	 
	 	return listInstancePatchesResponse;
	}
}