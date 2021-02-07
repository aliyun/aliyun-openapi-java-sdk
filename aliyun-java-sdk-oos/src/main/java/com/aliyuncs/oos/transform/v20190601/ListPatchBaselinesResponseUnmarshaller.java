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

import com.aliyuncs.oos.model.v20190601.ListPatchBaselinesResponse;
import com.aliyuncs.oos.model.v20190601.ListPatchBaselinesResponse.PatchBaseline;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPatchBaselinesResponseUnmarshaller {

	public static ListPatchBaselinesResponse unmarshall(ListPatchBaselinesResponse listPatchBaselinesResponse, UnmarshallerContext _ctx) {
		
		listPatchBaselinesResponse.setRequestId(_ctx.stringValue("ListPatchBaselinesResponse.RequestId"));
		listPatchBaselinesResponse.setMaxResults(_ctx.integerValue("ListPatchBaselinesResponse.MaxResults"));
		listPatchBaselinesResponse.setNextToken(_ctx.stringValue("ListPatchBaselinesResponse.NextToken"));

		List<PatchBaseline> patchBaselines = new ArrayList<PatchBaseline>();
		for (int i = 0; i < _ctx.lengthValue("ListPatchBaselinesResponse.PatchBaselines.Length"); i++) {
			PatchBaseline patchBaseline = new PatchBaseline();
			patchBaseline.setId(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].Id"));
			patchBaseline.setName(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].Name"));
			patchBaseline.setCreatedDate(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].CreatedDate"));
			patchBaseline.setCreatedBy(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].CreatedBy"));
			patchBaseline.setUpdatedDate(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].UpdatedDate"));
			patchBaseline.setUpdatedBy(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].UpdatedBy"));
			patchBaseline.setDescription(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].Description"));
			patchBaseline.setShareType(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].ShareType"));
			patchBaseline.setOperationSystem(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].OperationSystem"));
			patchBaseline.setIsDefault(_ctx.booleanValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].IsDefault"));

			patchBaselines.add(patchBaseline);
		}
		listPatchBaselinesResponse.setPatchBaselines(patchBaselines);
	 
	 	return listPatchBaselinesResponse;
	}
}