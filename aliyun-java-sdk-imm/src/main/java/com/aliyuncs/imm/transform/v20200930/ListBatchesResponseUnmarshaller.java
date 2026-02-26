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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.ListBatchesResponse;
import com.aliyuncs.imm.model.v20200930.ListBatchesResponse.BatchesItem;
import com.aliyuncs.imm.model.v20200930.ListBatchesResponse.BatchesItem.ActionsItem;
import com.aliyuncs.imm.model.v20200930.ListBatchesResponse.BatchesItem.Input;
import com.aliyuncs.imm.model.v20200930.ListBatchesResponse.BatchesItem.Input.OSS;
import com.aliyuncs.imm.model.v20200930.ListBatchesResponse.BatchesItem.Notification;
import com.aliyuncs.imm.model.v20200930.ListBatchesResponse.BatchesItem.Statistic;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBatchesResponseUnmarshaller {

	public static ListBatchesResponse unmarshall(ListBatchesResponse listBatchesResponse, UnmarshallerContext _ctx) {
		
		listBatchesResponse.setRequestId(_ctx.stringValue("ListBatchesResponse.RequestId"));
		listBatchesResponse.setNextToken(_ctx.stringValue("ListBatchesResponse.NextToken"));

		List<BatchesItem> batches = new ArrayList<BatchesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBatchesResponse.Batches.Length"); i++) {
			BatchesItem batchesItem = new BatchesItem();
			batchesItem.setId(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].Id"));
			batchesItem.setState(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].State"));
			batchesItem.setMarker(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].Marker"));
			batchesItem.setCreateTime(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].CreateTime"));
			batchesItem.setUpdateTime(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].UpdateTime"));
			batchesItem.setTags(_ctx.mapValue("ListBatchesResponse.Batches["+ i +"].Tags"));
			batchesItem.setError(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].Error"));

			Input input = new Input();

			OSS oSS = new OSS();
			oSS.setBucket(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].Input.OSS.Bucket"));
			oSS.setPrefix(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].Input.OSS.Prefix"));

			List<String> matchExpressions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListBatchesResponse.Batches["+ i +"].Input.OSS.MatchExpressions.Length"); j++) {
				matchExpressions.add(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].Input.OSS.MatchExpressions["+ j +"]"));
			}
			oSS.setMatchExpressions(matchExpressions);
			input.setOSS(oSS);
			batchesItem.setInput(input);

			Notification notification = new Notification();
			notification.setEndpoint(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].Notification.Endpoint"));
			notification.setTopic(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].Notification.Topic"));
			batchesItem.setNotification(notification);

			Statistic statistic = new Statistic();
			statistic.setSubmitSuccess(_ctx.longValue("ListBatchesResponse.Batches["+ i +"].Statistic.SubmitSuccess"));
			statistic.setSubmitFailure(_ctx.longValue("ListBatchesResponse.Batches["+ i +"].Statistic.SubmitFailure"));
			batchesItem.setStatistic(statistic);

			List<ActionsItem> actions = new ArrayList<ActionsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListBatchesResponse.Batches["+ i +"].Actions.Length"); j++) {
				ActionsItem actionsItem = new ActionsItem();
				actionsItem.setName(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].Actions["+ j +"].Name"));

				List<String> parameters = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListBatchesResponse.Batches["+ i +"].Actions["+ j +"].Parameters.Length"); k++) {
					parameters.add(_ctx.stringValue("ListBatchesResponse.Batches["+ i +"].Actions["+ j +"].Parameters["+ k +"]"));
				}
				actionsItem.setParameters(parameters);

				actions.add(actionsItem);
			}
			batchesItem.setActions(actions);

			batches.add(batchesItem);
		}
		listBatchesResponse.setBatches(batches);
	 
	 	return listBatchesResponse;
	}
}