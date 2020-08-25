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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.AnnotationsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse unmarshall(UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.RequestId"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.ResultCode"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.ResultMessage"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setCompletedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.CompletedAt"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setConclusion(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Conclusion"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setContext(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Context"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.CreatedAt"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setDetailUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.DetailUrl"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setExternalId(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.ExternalId"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Id"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setStartedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.StartedAt"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setStatus(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Status"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setSuiteId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.SuiteId"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setSummary(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Summary"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setTitle(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Title"));
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setUpdateAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.UpdateAt"));

		List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations.Length"); i++) {
			AnnotationsItem annotationsItem = new AnnotationsItem();
			annotationsItem.setCheckRunId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations["+ i +"].CheckRunId"));
			annotationsItem.setDetails(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations["+ i +"].Details"));
			annotationsItem.setEndCol(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations["+ i +"].EndCol"));
			annotationsItem.setEndLine(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations["+ i +"].EndLine"));
			annotationsItem.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations["+ i +"].Id"));
			annotationsItem.setLevel(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations["+ i +"].Level"));
			annotationsItem.setMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations["+ i +"].Message"));
			annotationsItem.setPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations["+ i +"].Path"));
			annotationsItem.setStartCol(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations["+ i +"].StartCol"));
			annotationsItem.setStartLine(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations["+ i +"].StartLine"));
			annotationsItem.setTitle(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.Annotations["+ i +"].Title"));

			annotations.add(annotationsItem);
		}
		updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.setAnnotations(annotations);
	 
	 	return updateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse;
	}
}