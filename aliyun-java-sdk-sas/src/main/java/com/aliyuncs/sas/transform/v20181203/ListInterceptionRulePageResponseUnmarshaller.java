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

import com.aliyuncs.sas.model.v20181203.ListInterceptionRulePageResponse;
import com.aliyuncs.sas.model.v20181203.ListInterceptionRulePageResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.ListInterceptionRulePageResponse.Rule;
import com.aliyuncs.sas.model.v20181203.ListInterceptionRulePageResponse.Rule.DstTarget;
import com.aliyuncs.sas.model.v20181203.ListInterceptionRulePageResponse.Rule.SrcTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInterceptionRulePageResponseUnmarshaller {

	public static ListInterceptionRulePageResponse unmarshall(ListInterceptionRulePageResponse listInterceptionRulePageResponse, UnmarshallerContext _ctx) {
		
		listInterceptionRulePageResponse.setRequestId(_ctx.stringValue("ListInterceptionRulePageResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListInterceptionRulePageResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListInterceptionRulePageResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListInterceptionRulePageResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListInterceptionRulePageResponse.PageInfo.Count"));
		listInterceptionRulePageResponse.setPageInfo(pageInfo);

		List<Rule> interceptionRuleList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("ListInterceptionRulePageResponse.InterceptionRuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleType(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].RuleType"));
			rule.setRuleSwitch(_ctx.integerValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].RuleSwitch"));
			rule.setRuleId(_ctx.longValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].RuleId"));
			rule.setRuleName(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].RuleName"));
			rule.setOrderIndex(_ctx.longValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].OrderIndex"));
			rule.setInterceptType(_ctx.longValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].InterceptType"));

			SrcTarget srcTarget = new SrcTarget();
			srcTarget.setAppName(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].SrcTarget.AppName"));
			srcTarget.setRuleType(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].SrcTarget.RuleType"));
			srcTarget.setTargetId(_ctx.integerValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].SrcTarget.TargetId"));
			srcTarget.setTargetName(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].SrcTarget.TargetName"));
			srcTarget.setNamespace(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].SrcTarget.Namespace"));
			srcTarget.setTargetType(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].SrcTarget.TargetType"));

			List<String> imageList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].SrcTarget.ImageList.Length"); j++) {
				imageList.add(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].SrcTarget.ImageList["+ j +"]"));
			}
			srcTarget.setImageList(imageList);

			List<String> tagList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].SrcTarget.TagList.Length"); j++) {
				tagList.add(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].SrcTarget.TagList["+ j +"]"));
			}
			srcTarget.setTagList(tagList);
			rule.setSrcTarget(srcTarget);

			DstTarget dstTarget = new DstTarget();
			dstTarget.setAppName(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.AppName"));
			dstTarget.setRuleType(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.RuleType"));
			dstTarget.setTargetId(_ctx.integerValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.TargetId"));
			dstTarget.setTargetName(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.TargetName"));
			dstTarget.setNamespace(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.Namespace"));
			dstTarget.setTargetType(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.TargetType"));

			List<String> ports = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.Ports.Length"); j++) {
				ports.add(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.Ports["+ j +"]"));
			}
			dstTarget.setPorts(ports);

			List<String> imageList1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.ImageList.Length"); j++) {
				imageList1.add(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.ImageList["+ j +"]"));
			}
			dstTarget.setImageList1(imageList1);

			List<String> tagList2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.TagList.Length"); j++) {
				tagList2.add(_ctx.stringValue("ListInterceptionRulePageResponse.InterceptionRuleList["+ i +"].DstTarget.TagList["+ j +"]"));
			}
			dstTarget.setTagList2(tagList2);
			rule.setDstTarget(dstTarget);

			interceptionRuleList.add(rule);
		}
		listInterceptionRulePageResponse.setInterceptionRuleList(interceptionRuleList);
	 
	 	return listInterceptionRulePageResponse;
	}
}