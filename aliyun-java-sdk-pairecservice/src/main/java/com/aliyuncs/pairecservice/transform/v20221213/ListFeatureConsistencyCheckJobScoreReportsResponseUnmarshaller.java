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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListFeatureConsistencyCheckJobScoreReportsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListFeatureConsistencyCheckJobScoreReportsResponse.ReportsOfScoreDiffItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFeatureConsistencyCheckJobScoreReportsResponseUnmarshaller {

	public static ListFeatureConsistencyCheckJobScoreReportsResponse unmarshall(ListFeatureConsistencyCheckJobScoreReportsResponse listFeatureConsistencyCheckJobScoreReportsResponse, UnmarshallerContext _ctx) {
		
		listFeatureConsistencyCheckJobScoreReportsResponse.setRequestId(_ctx.stringValue("ListFeatureConsistencyCheckJobScoreReportsResponse.RequestId"));
		listFeatureConsistencyCheckJobScoreReportsResponse.setDataPath(_ctx.stringValue("ListFeatureConsistencyCheckJobScoreReportsResponse.DataPath"));
		listFeatureConsistencyCheckJobScoreReportsResponse.setOssPath(_ctx.stringValue("ListFeatureConsistencyCheckJobScoreReportsResponse.OssPath"));

		List<ReportsOfScoreDiffItem> reportsOfScoreDiff = new ArrayList<ReportsOfScoreDiffItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFeatureConsistencyCheckJobScoreReportsResponse.ReportsOfScoreDiff.Length"); i++) {
			ReportsOfScoreDiffItem reportsOfScoreDiffItem = new ReportsOfScoreDiffItem();
			reportsOfScoreDiffItem.setLogUserId(_ctx.stringValue("ListFeatureConsistencyCheckJobScoreReportsResponse.ReportsOfScoreDiff["+ i +"].LogUserId"));
			reportsOfScoreDiffItem.setLogItemId(_ctx.stringValue("ListFeatureConsistencyCheckJobScoreReportsResponse.ReportsOfScoreDiff["+ i +"].LogItemId"));
			reportsOfScoreDiffItem.setLogRequestId(_ctx.stringValue("ListFeatureConsistencyCheckJobScoreReportsResponse.ReportsOfScoreDiff["+ i +"].LogRequestId"));
			reportsOfScoreDiffItem.setScoreDiff(_ctx.stringValue("ListFeatureConsistencyCheckJobScoreReportsResponse.ReportsOfScoreDiff["+ i +"].ScoreDiff"));
			reportsOfScoreDiffItem.setScoreDiffDetail(_ctx.stringValue("ListFeatureConsistencyCheckJobScoreReportsResponse.ReportsOfScoreDiff["+ i +"].ScoreDiffDetail"));

			reportsOfScoreDiff.add(reportsOfScoreDiffItem);
		}
		listFeatureConsistencyCheckJobScoreReportsResponse.setReportsOfScoreDiff(reportsOfScoreDiff);
	 
	 	return listFeatureConsistencyCheckJobScoreReportsResponse;
	}
}