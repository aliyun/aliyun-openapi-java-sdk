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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListNodesByBaselineResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListNodesByBaselineResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesByBaselineResponseUnmarshaller {

	public static ListNodesByBaselineResponse unmarshall(ListNodesByBaselineResponse listNodesByBaselineResponse, UnmarshallerContext _ctx) {
		
		listNodesByBaselineResponse.setRequestId(_ctx.stringValue("ListNodesByBaselineResponse.RequestId"));
		listNodesByBaselineResponse.setHttpStatusCode(_ctx.integerValue("ListNodesByBaselineResponse.HttpStatusCode"));
		listNodesByBaselineResponse.setErrorMessage(_ctx.stringValue("ListNodesByBaselineResponse.ErrorMessage"));
		listNodesByBaselineResponse.setErrorCode(_ctx.stringValue("ListNodesByBaselineResponse.ErrorCode"));
		listNodesByBaselineResponse.setSuccess(_ctx.stringValue("ListNodesByBaselineResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesByBaselineResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOwner(_ctx.stringValue("ListNodesByBaselineResponse.Data["+ i +"].Owner"));
			dataItem.setNodeName(_ctx.stringValue("ListNodesByBaselineResponse.Data["+ i +"].NodeName"));
			dataItem.setNodeId(_ctx.longValue("ListNodesByBaselineResponse.Data["+ i +"].NodeId"));
			dataItem.setProjectId(_ctx.longValue("ListNodesByBaselineResponse.Data["+ i +"].ProjectId"));

			data.add(dataItem);
		}
		listNodesByBaselineResponse.setData(data);
	 
	 	return listNodesByBaselineResponse;
	}
}