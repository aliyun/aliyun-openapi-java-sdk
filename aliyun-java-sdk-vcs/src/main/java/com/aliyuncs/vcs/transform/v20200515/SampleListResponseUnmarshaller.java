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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.SampleListResponse;
import com.aliyuncs.vcs.model.v20200515.SampleListResponse.Data;
import com.aliyuncs.vcs.model.v20200515.SampleListResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SampleListResponseUnmarshaller {

	public static SampleListResponse unmarshall(SampleListResponse sampleListResponse, UnmarshallerContext _ctx) {
		
		sampleListResponse.setRequestId(_ctx.stringValue("SampleListResponse.RequestId"));
		sampleListResponse.setMessage(_ctx.stringValue("SampleListResponse.Message"));
		sampleListResponse.setCode(_ctx.stringValue("SampleListResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("SampleListResponse.Data.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("SampleListResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setGmtCreate(_ctx.stringValue("SampleListResponse.Data.List["+ i +"].GmtCreate"));
			listItem.setMarkerCount(_ctx.longValue("SampleListResponse.Data.List["+ i +"].MarkerCount"));
			listItem.setType(_ctx.stringValue("SampleListResponse.Data.List["+ i +"].Type"));
			listItem.setAlgorithmId(_ctx.stringValue("SampleListResponse.Data.List["+ i +"].AlgorithmId"));
			listItem.setContent(_ctx.stringValue("SampleListResponse.Data.List["+ i +"].Content"));
			listItem.setUserId(_ctx.stringValue("SampleListResponse.Data.List["+ i +"].UserId"));
			listItem.setGmtModified(_ctx.stringValue("SampleListResponse.Data.List["+ i +"].GmtModified"));
			listItem.setId(_ctx.stringValue("SampleListResponse.Data.List["+ i +"].Id"));
			listItem.setUsages(_ctx.stringValue("SampleListResponse.Data.List["+ i +"].Usages"));
			listItem.setUrl(_ctx.stringValue("SampleListResponse.Data.List["+ i +"].Url"));

			list.add(listItem);
		}
		data.setList(list);
		sampleListResponse.setData(data);
	 
	 	return sampleListResponse;
	}
}