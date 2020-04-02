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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeLogAnalysisResponse;
import com.aliyuncs.nas.model.v20170626.DescribeLogAnalysisResponse.Analysis;
import com.aliyuncs.nas.model.v20170626.DescribeLogAnalysisResponse.Analysis.MetaValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogAnalysisResponseUnmarshaller {

	public static DescribeLogAnalysisResponse unmarshall(DescribeLogAnalysisResponse describeLogAnalysisResponse, UnmarshallerContext _ctx) {
		
		describeLogAnalysisResponse.setRequestId(_ctx.stringValue("DescribeLogAnalysisResponse.RequestId"));
		describeLogAnalysisResponse.setCode(_ctx.stringValue("DescribeLogAnalysisResponse.Code"));
		describeLogAnalysisResponse.setTotalCount(_ctx.integerValue("DescribeLogAnalysisResponse.TotalCount"));
		describeLogAnalysisResponse.setPageSize(_ctx.integerValue("DescribeLogAnalysisResponse.PageSize"));
		describeLogAnalysisResponse.setPageNumber(_ctx.integerValue("DescribeLogAnalysisResponse.PageNumber"));

		List<Analysis> analyses = new ArrayList<Analysis>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogAnalysisResponse.Analyses.Length"); i++) {
			Analysis analysis = new Analysis();
			analysis.setMetaKey(_ctx.stringValue("DescribeLogAnalysisResponse.Analyses["+ i +"].MetaKey"));

			MetaValue metaValue = new MetaValue();
			metaValue.setLogstore(_ctx.stringValue("DescribeLogAnalysisResponse.Analyses["+ i +"].MetaValue.Logstore"));
			metaValue.setRegion(_ctx.stringValue("DescribeLogAnalysisResponse.Analyses["+ i +"].MetaValue.Region"));
			metaValue.setProject(_ctx.stringValue("DescribeLogAnalysisResponse.Analyses["+ i +"].MetaValue.Project"));
			metaValue.setRoleArn(_ctx.stringValue("DescribeLogAnalysisResponse.Analyses["+ i +"].MetaValue.RoleArn"));
			analysis.setMetaValue(metaValue);

			analyses.add(analysis);
		}
		describeLogAnalysisResponse.setAnalyses(analyses);
	 
	 	return describeLogAnalysisResponse;
	}
}