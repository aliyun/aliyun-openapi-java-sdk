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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetSQLReviewOptimizeDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetSQLReviewOptimizeDetailResponse.OptimizeDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult;
import com.aliyuncs.dms_enterprise.model.v20181101.GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.ResultsItem;
import com.aliyuncs.dms_enterprise.model.v20181101.GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.ResultsItem.ScriptsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSQLReviewOptimizeDetailResponseUnmarshaller {

	public static GetSQLReviewOptimizeDetailResponse unmarshall(GetSQLReviewOptimizeDetailResponse getSQLReviewOptimizeDetailResponse, UnmarshallerContext _ctx) {
		
		getSQLReviewOptimizeDetailResponse.setRequestId(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.RequestId"));
		getSQLReviewOptimizeDetailResponse.setErrorCode(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.ErrorCode"));
		getSQLReviewOptimizeDetailResponse.setErrorMessage(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.ErrorMessage"));
		getSQLReviewOptimizeDetailResponse.setSuccess(_ctx.booleanValue("GetSQLReviewOptimizeDetailResponse.Success"));

		OptimizeDetail optimizeDetail = new OptimizeDetail();
		optimizeDetail.setQueryKey(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QueryKey"));
		optimizeDetail.setInstanceId(_ctx.integerValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.InstanceId"));
		optimizeDetail.setDbId(_ctx.integerValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.DbId"));
		optimizeDetail.setSqlType(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.SqlType"));

		QualityResult qualityResult = new QualityResult();
		qualityResult.setErrorMessage(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.ErrorMessage"));
		qualityResult.setOccurError(_ctx.booleanValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.OccurError"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setRuleName(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.Results["+ i +"].RuleName"));
			resultsItem.setFeedback(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.Results["+ i +"].Feedback"));
			resultsItem.setComments(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.Results["+ i +"].Comments"));
			resultsItem.setRuleType(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.Results["+ i +"].RuleType"));

			List<String> messages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.Results["+ i +"].Messages.Length"); j++) {
				messages.add(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.Results["+ i +"].Messages["+ j +"]"));
			}
			resultsItem.setMessages(messages);

			List<ScriptsItem> scripts = new ArrayList<ScriptsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.Results["+ i +"].Scripts.Length"); j++) {
				ScriptsItem scriptsItem = new ScriptsItem();
				scriptsItem.setOpType(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.Results["+ i +"].Scripts["+ j +"].OpType"));
				scriptsItem.setContent(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.Results["+ i +"].Scripts["+ j +"].Content"));
				scriptsItem.setTableName(_ctx.stringValue("GetSQLReviewOptimizeDetailResponse.OptimizeDetail.QualityResult.Results["+ i +"].Scripts["+ j +"].TableName"));

				scripts.add(scriptsItem);
			}
			resultsItem.setScripts(scripts);

			results.add(resultsItem);
		}
		qualityResult.setResults(results);
		optimizeDetail.setQualityResult(qualityResult);
		getSQLReviewOptimizeDetailResponse.setOptimizeDetail(optimizeDetail);
	 
	 	return getSQLReviewOptimizeDetailResponse;
	}
}