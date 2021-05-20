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

import com.aliyuncs.vcs.model.v20200515.ListTrainLabelResponse;
import com.aliyuncs.vcs.model.v20200515.ListTrainLabelResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListTrainLabelResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrainLabelResponseUnmarshaller {

	public static ListTrainLabelResponse unmarshall(ListTrainLabelResponse listTrainLabelResponse, UnmarshallerContext _ctx) {
		
		listTrainLabelResponse.setRequestId(_ctx.stringValue("ListTrainLabelResponse.RequestId"));
		listTrainLabelResponse.setMessage(_ctx.stringValue("ListTrainLabelResponse.Message"));
		listTrainLabelResponse.setCode(_ctx.stringValue("ListTrainLabelResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListTrainLabelResponse.Data.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTrainLabelResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setGmtCreate(_ctx.stringValue("ListTrainLabelResponse.Data.List["+ i +"].GmtCreate"));
			listItem.setTrainMarkerCnt(_ctx.longValue("ListTrainLabelResponse.Data.List["+ i +"].TrainMarkerCnt"));
			listItem.setAlgorithmId(_ctx.stringValue("ListTrainLabelResponse.Data.List["+ i +"].AlgorithmId"));
			listItem.setGmtModified(_ctx.stringValue("ListTrainLabelResponse.Data.List["+ i +"].GmtModified"));
			listItem.setLabelName(_ctx.stringValue("ListTrainLabelResponse.Data.List["+ i +"].LabelName"));
			listItem.setDeleted(_ctx.stringValue("ListTrainLabelResponse.Data.List["+ i +"].Deleted"));
			listItem.setId(_ctx.stringValue("ListTrainLabelResponse.Data.List["+ i +"].Id"));
			listItem.setTestMarkerCnt(_ctx.longValue("ListTrainLabelResponse.Data.List["+ i +"].TestMarkerCnt"));

			list.add(listItem);
		}
		data.setList(list);
		listTrainLabelResponse.setData(data);
	 
	 	return listTrainLabelResponse;
	}
}