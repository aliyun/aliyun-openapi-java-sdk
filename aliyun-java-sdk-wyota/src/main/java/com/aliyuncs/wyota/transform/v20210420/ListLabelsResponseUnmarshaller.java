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

package com.aliyuncs.wyota.transform.v20210420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.ListLabelsResponse;
import com.aliyuncs.wyota.model.v20210420.ListLabelsResponse.Label;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabelsResponseUnmarshaller {

	public static ListLabelsResponse unmarshall(ListLabelsResponse listLabelsResponse, UnmarshallerContext _ctx) {
		
		listLabelsResponse.setRequestId(_ctx.stringValue("ListLabelsResponse.RequestId"));
		listLabelsResponse.setNextToken(_ctx.stringValue("ListLabelsResponse.NextToken"));
		listLabelsResponse.setMessage(_ctx.stringValue("ListLabelsResponse.Message"));
		listLabelsResponse.setCode(_ctx.stringValue("ListLabelsResponse.Code"));

		List<Label> data = new ArrayList<Label>();
		for (int i = 0; i < _ctx.lengthValue("ListLabelsResponse.Data.Length"); i++) {
			Label label = new Label();
			label.setContent(_ctx.stringValue("ListLabelsResponse.Data["+ i +"].Content"));
			label.setGmtCreate(_ctx.longValue("ListLabelsResponse.Data["+ i +"].GmtCreate"));
			label.setGmtModified(_ctx.longValue("ListLabelsResponse.Data["+ i +"].GmtModified"));
			label.setLabelId(_ctx.stringValue("ListLabelsResponse.Data["+ i +"].LabelId"));
			label.setTenantId(_ctx.stringValue("ListLabelsResponse.Data["+ i +"].TenantId"));
			label.setId(_ctx.longValue("ListLabelsResponse.Data["+ i +"].Id"));

			data.add(label);
		}
		listLabelsResponse.setData(data);
	 
	 	return listLabelsResponse;
	}
}