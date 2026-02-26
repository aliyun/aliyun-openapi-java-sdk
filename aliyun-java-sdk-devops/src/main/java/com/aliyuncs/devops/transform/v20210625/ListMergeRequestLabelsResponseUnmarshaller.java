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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListMergeRequestLabelsResponse;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestLabelsResponse.Cr_labels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMergeRequestLabelsResponseUnmarshaller {

	public static ListMergeRequestLabelsResponse unmarshall(ListMergeRequestLabelsResponse listMergeRequestLabelsResponse, UnmarshallerContext _ctx) {
		
		listMergeRequestLabelsResponse.setRequestId(_ctx.stringValue("ListMergeRequestLabelsResponse.requestId"));
		listMergeRequestLabelsResponse.setSuccess(_ctx.booleanValue("ListMergeRequestLabelsResponse.success"));
		listMergeRequestLabelsResponse.setErrorCode(_ctx.stringValue("ListMergeRequestLabelsResponse.errorCode"));
		listMergeRequestLabelsResponse.setErrorMessage(_ctx.stringValue("ListMergeRequestLabelsResponse.errorMessage"));

		List<Cr_labels> result = new ArrayList<Cr_labels>();
		for (int i = 0; i < _ctx.lengthValue("ListMergeRequestLabelsResponse.result.Length"); i++) {
			Cr_labels cr_labels = new Cr_labels();
			cr_labels.setId(_ctx.stringValue("ListMergeRequestLabelsResponse.result["+ i +"].id"));
			cr_labels.setName(_ctx.stringValue("ListMergeRequestLabelsResponse.result["+ i +"].name"));
			cr_labels.setDescription(_ctx.stringValue("ListMergeRequestLabelsResponse.result["+ i +"].description"));
			cr_labels.setColor(_ctx.stringValue("ListMergeRequestLabelsResponse.result["+ i +"].color"));

			result.add(cr_labels);
		}
		listMergeRequestLabelsResponse.setResult(result);
	 
	 	return listMergeRequestLabelsResponse;
	}
}