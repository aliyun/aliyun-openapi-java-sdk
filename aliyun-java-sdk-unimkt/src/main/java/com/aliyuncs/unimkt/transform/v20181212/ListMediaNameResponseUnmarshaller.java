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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.ListMediaNameResponse;
import com.aliyuncs.unimkt.model.v20181212.ListMediaNameResponse.Media;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMediaNameResponseUnmarshaller {

	public static ListMediaNameResponse unmarshall(ListMediaNameResponse listMediaNameResponse, UnmarshallerContext _ctx) {
		
		listMediaNameResponse.setRequestId(_ctx.stringValue("ListMediaNameResponse.RequestId"));
		listMediaNameResponse.setCode(_ctx.stringValue("ListMediaNameResponse.Code"));
		listMediaNameResponse.setSuccess(_ctx.booleanValue("ListMediaNameResponse.Success"));
		listMediaNameResponse.setMessage(_ctx.stringValue("ListMediaNameResponse.Message"));
		listMediaNameResponse.setPageNumber(_ctx.integerValue("ListMediaNameResponse.PageNumber"));
		listMediaNameResponse.setPageSize(_ctx.integerValue("ListMediaNameResponse.PageSize"));
		listMediaNameResponse.setTotal(_ctx.longValue("ListMediaNameResponse.Total"));

		List<Media> model = new ArrayList<Media>();
		for (int i = 0; i < _ctx.lengthValue("ListMediaNameResponse.Model.Length"); i++) {
			Media media = new Media();
			media.setMediaName(_ctx.stringValue("ListMediaNameResponse.Model["+ i +"].MediaName"));
			media.setMediaId(_ctx.stringValue("ListMediaNameResponse.Model["+ i +"].MediaId"));

			model.add(media);
		}
		listMediaNameResponse.setModel(model);
	 
	 	return listMediaNameResponse;
	}
}