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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeJudgementDocResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeJudgementDocResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcJusticeJudgementDocResponseUnmarshaller {

	public static GetOcJusticeJudgementDocResponse unmarshall(GetOcJusticeJudgementDocResponse getOcJusticeJudgementDocResponse, UnmarshallerContext _ctx) {
		
		getOcJusticeJudgementDocResponse.setRequestId(_ctx.stringValue("GetOcJusticeJudgementDocResponse.RequestId"));
		getOcJusticeJudgementDocResponse.setCode(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Code"));
		getOcJusticeJudgementDocResponse.setSuccess(_ctx.booleanValue("GetOcJusticeJudgementDocResponse.Success"));
		getOcJusticeJudgementDocResponse.setMessage(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Message"));
		getOcJusticeJudgementDocResponse.setTotalNum(_ctx.integerValue("GetOcJusticeJudgementDocResponse.TotalNum"));
		getOcJusticeJudgementDocResponse.setPageIndex(_ctx.integerValue("GetOcJusticeJudgementDocResponse.PageIndex"));
		getOcJusticeJudgementDocResponse.setPageNum(_ctx.integerValue("GetOcJusticeJudgementDocResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcJusticeJudgementDocResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTitle(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].Title"));
			dataItem.setCaseNum(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].CaseNum"));
			dataItem.setRole(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].Role"));
			dataItem.setJudgeResult(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].JudgeResult"));
			dataItem.setJudgeDate(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].JudgeDate"));
			dataItem.setPublicDate(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].PublicDate"));
			dataItem.setCauseAction(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].CauseAction"));
			dataItem.setCaseType(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].CaseType"));
			dataItem.setCourt(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].Court"));
			dataItem.setSubAmount(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].SubAmount"));
			dataItem.setCaseFlow(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].CaseFlow"));
			dataItem.setParty(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].Party"));
			dataItem.setPlaintiff(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].Plaintiff"));
			dataItem.setDefendant(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].Defendant"));
			dataItem.setJudgeType(_ctx.stringValue("GetOcJusticeJudgementDocResponse.Data["+ i +"].JudgeType"));

			data.add(dataItem);
		}
		getOcJusticeJudgementDocResponse.setData(data);
	 
	 	return getOcJusticeJudgementDocResponse;
	}
}