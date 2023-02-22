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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetInterceptionTargetDetailResponse;
import com.aliyuncs.sas.model.v20181203.GetInterceptionTargetDetailResponse.RuleTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInterceptionTargetDetailResponseUnmarshaller {

	public static GetInterceptionTargetDetailResponse unmarshall(GetInterceptionTargetDetailResponse getInterceptionTargetDetailResponse, UnmarshallerContext _ctx) {
		
		getInterceptionTargetDetailResponse.setRequestId(_ctx.stringValue("GetInterceptionTargetDetailResponse.RequestId"));

		RuleTarget ruleTarget = new RuleTarget();
		ruleTarget.setAppName(_ctx.stringValue("GetInterceptionTargetDetailResponse.RuleTarget.AppName"));
		ruleTarget.setTargetId(_ctx.longValue("GetInterceptionTargetDetailResponse.RuleTarget.TargetId"));
		ruleTarget.setTargetName(_ctx.stringValue("GetInterceptionTargetDetailResponse.RuleTarget.TargetName"));
		ruleTarget.setNamespace(_ctx.stringValue("GetInterceptionTargetDetailResponse.RuleTarget.Namespace"));
		ruleTarget.setTargetType(_ctx.stringValue("GetInterceptionTargetDetailResponse.RuleTarget.TargetType"));
		ruleTarget.setClusterName(_ctx.stringValue("GetInterceptionTargetDetailResponse.RuleTarget.ClusterName"));
		ruleTarget.setClusterId(_ctx.stringValue("GetInterceptionTargetDetailResponse.RuleTarget.ClusterId"));

		List<String> imageList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInterceptionTargetDetailResponse.RuleTarget.ImageList.Length"); i++) {
			imageList.add(_ctx.stringValue("GetInterceptionTargetDetailResponse.RuleTarget.ImageList["+ i +"]"));
		}
		ruleTarget.setImageList(imageList);

		List<String> tagList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInterceptionTargetDetailResponse.RuleTarget.TagList.Length"); i++) {
			tagList.add(_ctx.stringValue("GetInterceptionTargetDetailResponse.RuleTarget.TagList["+ i +"]"));
		}
		ruleTarget.setTagList(tagList);
		getInterceptionTargetDetailResponse.setRuleTarget(ruleTarget);
	 
	 	return getInterceptionTargetDetailResponse;
	}
}