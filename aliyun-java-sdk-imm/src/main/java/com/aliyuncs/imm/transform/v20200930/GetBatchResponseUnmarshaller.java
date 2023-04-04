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

import com.aliyuncs.imm.model.v20200930.GetBatchResponse;
import com.aliyuncs.imm.model.v20200930.GetBatchResponse.Batch;
import com.aliyuncs.imm.model.v20200930.GetBatchResponse.Batch.ActionsItem;
import com.aliyuncs.imm.model.v20200930.GetBatchResponse.Batch.Input;
import com.aliyuncs.imm.model.v20200930.GetBatchResponse.Batch.Input.OSS;
import com.aliyuncs.imm.model.v20200930.GetBatchResponse.Batch.Notification;
import com.aliyuncs.imm.model.v20200930.GetBatchResponse.Batch.Statistic;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBatchResponseUnmarshaller {

	public static GetBatchResponse unmarshall(GetBatchResponse getBatchResponse, UnmarshallerContext _ctx) {
		
		getBatchResponse.setRequestId(_ctx.stringValue("GetBatchResponse.RequestId"));

		Batch batch = new Batch();
		batch.setId(_ctx.stringValue("GetBatchResponse.Batch.Id"));
		batch.setState(_ctx.stringValue("GetBatchResponse.Batch.State"));
		batch.setMarker(_ctx.stringValue("GetBatchResponse.Batch.Marker"));
		batch.setCreateTime(_ctx.stringValue("GetBatchResponse.Batch.CreateTime"));
		batch.setUpdateTime(_ctx.stringValue("GetBatchResponse.Batch.UpdateTime"));
		batch.setTags(_ctx.mapValue("GetBatchResponse.Batch.Tags"));
		batch.setError(_ctx.stringValue("GetBatchResponse.Batch.Error"));

		Input input = new Input();

		OSS oSS = new OSS();
		oSS.setBucket(_ctx.stringValue("GetBatchResponse.Batch.Input.OSS.Bucket"));
		oSS.setPrefix(_ctx.stringValue("GetBatchResponse.Batch.Input.OSS.Prefix"));

		List<String> matchExpressions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchResponse.Batch.Input.OSS.MatchExpressions.Length"); i++) {
			matchExpressions.add(_ctx.stringValue("GetBatchResponse.Batch.Input.OSS.MatchExpressions["+ i +"]"));
		}
		oSS.setMatchExpressions(matchExpressions);
		input.setOSS(oSS);
		batch.setInput(input);

		Notification notification = new Notification();
		notification.setEndpoint(_ctx.stringValue("GetBatchResponse.Batch.Notification.Endpoint"));
		notification.setTopic(_ctx.stringValue("GetBatchResponse.Batch.Notification.Topic"));
		batch.setNotification(notification);

		Statistic statistic = new Statistic();
		statistic.setSubmitSuccess(_ctx.longValue("GetBatchResponse.Batch.Statistic.SubmitSuccess"));
		statistic.setSubmitFailure(_ctx.longValue("GetBatchResponse.Batch.Statistic.SubmitFailure"));
		batch.setStatistic(statistic);

		List<ActionsItem> actions = new ArrayList<ActionsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchResponse.Batch.Actions.Length"); i++) {
			ActionsItem actionsItem = new ActionsItem();
			actionsItem.setName(_ctx.stringValue("GetBatchResponse.Batch.Actions["+ i +"].Name"));

			List<String> parameters = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetBatchResponse.Batch.Actions["+ i +"].Parameters.Length"); j++) {
				parameters.add(_ctx.stringValue("GetBatchResponse.Batch.Actions["+ i +"].Parameters["+ j +"]"));
			}
			actionsItem.setParameters(parameters);

			actions.add(actionsItem);
		}
		batch.setActions(actions);
		getBatchResponse.setBatch(batch);
	 
	 	return getBatchResponse;
	}
}