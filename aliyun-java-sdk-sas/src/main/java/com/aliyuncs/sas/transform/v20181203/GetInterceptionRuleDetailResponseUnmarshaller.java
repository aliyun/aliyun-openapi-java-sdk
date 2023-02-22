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

import com.aliyuncs.sas.model.v20181203.GetInterceptionRuleDetailResponse;
import com.aliyuncs.sas.model.v20181203.GetInterceptionRuleDetailResponse.InterceptionRuleDetail;
import com.aliyuncs.sas.model.v20181203.GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget;
import com.aliyuncs.sas.model.v20181203.GetInterceptionRuleDetailResponse.InterceptionRuleDetail.SrcTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInterceptionRuleDetailResponseUnmarshaller {

	public static GetInterceptionRuleDetailResponse unmarshall(GetInterceptionRuleDetailResponse getInterceptionRuleDetailResponse, UnmarshallerContext _ctx) {
		
		getInterceptionRuleDetailResponse.setRequestId(_ctx.stringValue("GetInterceptionRuleDetailResponse.RequestId"));

		InterceptionRuleDetail interceptionRuleDetail = new InterceptionRuleDetail();
		interceptionRuleDetail.setRuleType(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.RuleType"));
		interceptionRuleDetail.setRuleSwitch(_ctx.integerValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.RuleSwitch"));
		interceptionRuleDetail.setRuleId(_ctx.longValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.RuleId"));
		interceptionRuleDetail.setRuleName(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.RuleName"));
		interceptionRuleDetail.setInterceptType(_ctx.longValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.InterceptType"));
		interceptionRuleDetail.setOrderIndex(_ctx.longValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.OrderIndex"));

		SrcTarget srcTarget = new SrcTarget();
		srcTarget.setAppName(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.SrcTarget.AppName"));
		srcTarget.setRuleType(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.SrcTarget.RuleType"));
		srcTarget.setTargetId(_ctx.integerValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.SrcTarget.TargetId"));
		srcTarget.setTargetName(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.SrcTarget.TargetName"));
		srcTarget.setNamespace(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.SrcTarget.Namespace"));
		srcTarget.setTargetType(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.SrcTarget.TargetType"));

		List<String> imageList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.SrcTarget.ImageList.Length"); i++) {
			imageList.add(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.SrcTarget.ImageList["+ i +"]"));
		}
		srcTarget.setImageList(imageList);

		List<String> tagList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.SrcTarget.TagList.Length"); i++) {
			tagList.add(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.SrcTarget.TagList["+ i +"]"));
		}
		srcTarget.setTagList(tagList);
		interceptionRuleDetail.setSrcTarget(srcTarget);

		DstTarget dstTarget = new DstTarget();
		dstTarget.setAppName(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.AppName"));
		dstTarget.setRuleType(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.RuleType"));
		dstTarget.setTargetId(_ctx.integerValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.TargetId"));
		dstTarget.setTargetName(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.TargetName"));
		dstTarget.setNamespace(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.Namespace"));
		dstTarget.setTargetType(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.TargetType"));

		List<String> ports = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.Ports.Length"); i++) {
			ports.add(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.Ports["+ i +"]"));
		}
		dstTarget.setPorts(ports);

		List<String> imageList1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.ImageList.Length"); i++) {
			imageList1.add(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.ImageList["+ i +"]"));
		}
		dstTarget.setImageList1(imageList1);

		List<String> tagList2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.TagList.Length"); i++) {
			tagList2.add(_ctx.stringValue("GetInterceptionRuleDetailResponse.InterceptionRuleDetail.DstTarget.TagList["+ i +"]"));
		}
		dstTarget.setTagList2(tagList2);
		interceptionRuleDetail.setDstTarget(dstTarget);
		getInterceptionRuleDetailResponse.setInterceptionRuleDetail(interceptionRuleDetail);
	 
	 	return getInterceptionRuleDetailResponse;
	}
}