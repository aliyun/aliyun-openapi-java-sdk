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

package com.aliyuncs.mpserverless.transform.v20190615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpserverless.model.v20190615.ListSpaceOfLabelResponse;
import com.aliyuncs.mpserverless.model.v20190615.ListSpaceOfLabelResponse.Space;
import com.aliyuncs.mpserverless.model.v20190615.ListSpaceOfLabelResponse.Space.Label;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSpaceOfLabelResponseUnmarshaller {

	public static ListSpaceOfLabelResponse unmarshall(ListSpaceOfLabelResponse listSpaceOfLabelResponse, UnmarshallerContext _ctx) {
		
		listSpaceOfLabelResponse.setRequestId(_ctx.stringValue("ListSpaceOfLabelResponse.RequestId"));
		listSpaceOfLabelResponse.setHttpStatusCode(_ctx.stringValue("ListSpaceOfLabelResponse.HttpStatusCode"));
		listSpaceOfLabelResponse.setSuccess(_ctx.booleanValue("ListSpaceOfLabelResponse.Success"));
		listSpaceOfLabelResponse.setCode(_ctx.stringValue("ListSpaceOfLabelResponse.Code"));
		listSpaceOfLabelResponse.setMessage(_ctx.stringValue("ListSpaceOfLabelResponse.Message"));
		listSpaceOfLabelResponse.setGmtCreate(_ctx.stringValue("ListSpaceOfLabelResponse.GmtCreate"));

		List<Space> spaces = new ArrayList<Space>();
		for (int i = 0; i < _ctx.lengthValue("ListSpaceOfLabelResponse.Spaces.Length"); i++) {
			Space space = new Space();
			space.setSpaceId(_ctx.stringValue("ListSpaceOfLabelResponse.Spaces["+ i +"].SpaceId"));
			space.setName(_ctx.stringValue("ListSpaceOfLabelResponse.Spaces["+ i +"].Name"));
			space.setDesc(_ctx.stringValue("ListSpaceOfLabelResponse.Spaces["+ i +"].Desc"));
			space.setStatus(_ctx.stringValue("ListSpaceOfLabelResponse.Spaces["+ i +"].Status"));
			space.setGmtCreate(_ctx.longValue("ListSpaceOfLabelResponse.Spaces["+ i +"].GmtCreate"));

			List<Label> labels = new ArrayList<Label>();
			for (int j = 0; j < _ctx.lengthValue("ListSpaceOfLabelResponse.Spaces["+ i +"].Labels.Length"); j++) {
				Label label = new Label();
				label.setName(_ctx.stringValue("ListSpaceOfLabelResponse.Spaces["+ i +"].Labels["+ j +"].Name"));
				label.setValue(_ctx.stringValue("ListSpaceOfLabelResponse.Spaces["+ i +"].Labels["+ j +"].Value"));

				labels.add(label);
			}
			space.setLabels(labels);

			spaces.add(space);
		}
		listSpaceOfLabelResponse.setSpaces(spaces);
	 
	 	return listSpaceOfLabelResponse;
	}
}