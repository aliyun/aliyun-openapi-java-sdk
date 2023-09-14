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

import com.aliyuncs.pairecservice.model.v20221213.ListFeatureConsistencyCheckJobFeatureReportsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListFeatureConsistencyCheckJobFeatureReportsResponse.ReportsOfFeatureDiffItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFeatureConsistencyCheckJobFeatureReportsResponseUnmarshaller {

	public static ListFeatureConsistencyCheckJobFeatureReportsResponse unmarshall(ListFeatureConsistencyCheckJobFeatureReportsResponse listFeatureConsistencyCheckJobFeatureReportsResponse, UnmarshallerContext _ctx) {
		
		listFeatureConsistencyCheckJobFeatureReportsResponse.setRequestId(_ctx.stringValue("ListFeatureConsistencyCheckJobFeatureReportsResponse.RequestId"));
		listFeatureConsistencyCheckJobFeatureReportsResponse.setDataPath(_ctx.stringValue("ListFeatureConsistencyCheckJobFeatureReportsResponse.DataPath"));
		listFeatureConsistencyCheckJobFeatureReportsResponse.setOssPath(_ctx.stringValue("ListFeatureConsistencyCheckJobFeatureReportsResponse.OssPath"));

		List<ReportsOfFeatureDiffItem> reportsOfFeatureDiff = new ArrayList<ReportsOfFeatureDiffItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFeatureConsistencyCheckJobFeatureReportsResponse.ReportsOfFeatureDiff.Length"); i++) {
			ReportsOfFeatureDiffItem reportsOfFeatureDiffItem = new ReportsOfFeatureDiffItem();
			reportsOfFeatureDiffItem.setLogUserId(_ctx.stringValue("ListFeatureConsistencyCheckJobFeatureReportsResponse.ReportsOfFeatureDiff["+ i +"].LogUserId"));
			reportsOfFeatureDiffItem.setLogItemId(_ctx.stringValue("ListFeatureConsistencyCheckJobFeatureReportsResponse.ReportsOfFeatureDiff["+ i +"].LogItemId"));
			reportsOfFeatureDiffItem.setLogRequestId(_ctx.stringValue("ListFeatureConsistencyCheckJobFeatureReportsResponse.ReportsOfFeatureDiff["+ i +"].LogRequestId"));
			reportsOfFeatureDiffItem.setFeatureName(_ctx.stringValue("ListFeatureConsistencyCheckJobFeatureReportsResponse.ReportsOfFeatureDiff["+ i +"].FeatureName"));
			reportsOfFeatureDiffItem.setOfflineValue(_ctx.stringValue("ListFeatureConsistencyCheckJobFeatureReportsResponse.ReportsOfFeatureDiff["+ i +"].OfflineValue"));
			reportsOfFeatureDiffItem.setOnlineValue(_ctx.stringValue("ListFeatureConsistencyCheckJobFeatureReportsResponse.ReportsOfFeatureDiff["+ i +"].OnlineValue"));

			reportsOfFeatureDiff.add(reportsOfFeatureDiffItem);
		}
		listFeatureConsistencyCheckJobFeatureReportsResponse.setReportsOfFeatureDiff(reportsOfFeatureDiff);
	 
	 	return listFeatureConsistencyCheckJobFeatureReportsResponse;
	}
}