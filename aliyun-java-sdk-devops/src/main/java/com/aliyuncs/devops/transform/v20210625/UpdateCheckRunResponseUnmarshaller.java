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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.UpdateCheckRunResponse;
import com.aliyuncs.devops.model.v20210625.UpdateCheckRunResponse.Result;
import com.aliyuncs.devops.model.v20210625.UpdateCheckRunResponse.Result.CheckSuite;
import com.aliyuncs.devops.model.v20210625.UpdateCheckRunResponse.Result.Check_run_annotations;
import com.aliyuncs.devops.model.v20210625.UpdateCheckRunResponse.Result.Output;
import com.aliyuncs.devops.model.v20210625.UpdateCheckRunResponse.Result.Output.Output_images;
import com.aliyuncs.devops.model.v20210625.UpdateCheckRunResponse.Result.Writer;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCheckRunResponseUnmarshaller {

	public static UpdateCheckRunResponse unmarshall(UpdateCheckRunResponse updateCheckRunResponse, UnmarshallerContext _ctx) {
		
		updateCheckRunResponse.setRequestId(_ctx.stringValue("UpdateCheckRunResponse.requestId"));
		updateCheckRunResponse.setSuccess(_ctx.booleanValue("UpdateCheckRunResponse.success"));
		updateCheckRunResponse.setErrorCode(_ctx.stringValue("UpdateCheckRunResponse.errorCode"));
		updateCheckRunResponse.setErrorMessage(_ctx.stringValue("UpdateCheckRunResponse.errorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("UpdateCheckRunResponse.result.id"));
		result.setCreatedAt(_ctx.stringValue("UpdateCheckRunResponse.result.createdAt"));
		result.setUpdatedAt(_ctx.stringValue("UpdateCheckRunResponse.result.updatedAt"));
		result.setStartedAt(_ctx.stringValue("UpdateCheckRunResponse.result.startedAt"));
		result.setCompletedAt(_ctx.stringValue("UpdateCheckRunResponse.result.completedAt"));
		result.setExternalId(_ctx.stringValue("UpdateCheckRunResponse.result.externalId"));
		result.setName(_ctx.stringValue("UpdateCheckRunResponse.result.name"));
		result.setHeadSha(_ctx.stringValue("UpdateCheckRunResponse.result.headSha"));
		result.setStatus(_ctx.stringValue("UpdateCheckRunResponse.result.status"));
		result.setConclusion(_ctx.stringValue("UpdateCheckRunResponse.result.conclusion"));
		result.setDetailsUrl(_ctx.stringValue("UpdateCheckRunResponse.result.detailsUrl"));

		CheckSuite checkSuite = new CheckSuite();
		checkSuite.setId(_ctx.longValue("UpdateCheckRunResponse.result.checkSuite.id"));
		result.setCheckSuite(checkSuite);

		Writer writer = new Writer();
		writer.setId(_ctx.stringValue("UpdateCheckRunResponse.result.writer.id"));
		writer.setType(_ctx.stringValue("UpdateCheckRunResponse.result.writer.type"));
		writer.setName(_ctx.stringValue("UpdateCheckRunResponse.result.writer.name"));
		writer.setSlug(_ctx.stringValue("UpdateCheckRunResponse.result.writer.slug"));
		writer.setLogoUrl(_ctx.stringValue("UpdateCheckRunResponse.result.writer.logoUrl"));
		result.setWriter(writer);

		Output output = new Output();
		output.setTitle(_ctx.stringValue("UpdateCheckRunResponse.result.output.title"));
		output.setSummary(_ctx.stringValue("UpdateCheckRunResponse.result.output.summary"));
		output.setText(_ctx.stringValue("UpdateCheckRunResponse.result.output.text"));

		List<Output_images> images = new ArrayList<Output_images>();
		for (int i = 0; i < _ctx.lengthValue("UpdateCheckRunResponse.result.output.images.Length"); i++) {
			Output_images output_images = new Output_images();
			output_images.setAlt(_ctx.stringValue("UpdateCheckRunResponse.result.output.images["+ i +"].alt"));
			output_images.setImageUrl(_ctx.stringValue("UpdateCheckRunResponse.result.output.images["+ i +"].imageUrl"));
			output_images.setCaption(_ctx.stringValue("UpdateCheckRunResponse.result.output.images["+ i +"].caption"));

			images.add(output_images);
		}
		output.setImages(images);
		result.setOutput(output);

		List<Check_run_annotations> annotations = new ArrayList<Check_run_annotations>();
		for (int i = 0; i < _ctx.lengthValue("UpdateCheckRunResponse.result.annotations.Length"); i++) {
			Check_run_annotations check_run_annotations = new Check_run_annotations();
			check_run_annotations.setId(_ctx.longValue("UpdateCheckRunResponse.result.annotations["+ i +"].id"));
			check_run_annotations.setPath(_ctx.stringValue("UpdateCheckRunResponse.result.annotations["+ i +"].path"));
			check_run_annotations.setStartLine(_ctx.longValue("UpdateCheckRunResponse.result.annotations["+ i +"].startLine"));
			check_run_annotations.setEndLine(_ctx.longValue("UpdateCheckRunResponse.result.annotations["+ i +"].endLine"));
			check_run_annotations.setStartColumn(_ctx.longValue("UpdateCheckRunResponse.result.annotations["+ i +"].startColumn"));
			check_run_annotations.setEndColumn(_ctx.longValue("UpdateCheckRunResponse.result.annotations["+ i +"].endColumn"));
			check_run_annotations.setAnnotationLevel(_ctx.stringValue("UpdateCheckRunResponse.result.annotations["+ i +"].annotationLevel"));
			check_run_annotations.setMessage(_ctx.stringValue("UpdateCheckRunResponse.result.annotations["+ i +"].message"));
			check_run_annotations.setTitle(_ctx.stringValue("UpdateCheckRunResponse.result.annotations["+ i +"].title"));
			check_run_annotations.setRawDetails(_ctx.stringValue("UpdateCheckRunResponse.result.annotations["+ i +"].rawDetails"));

			annotations.add(check_run_annotations);
		}
		result.setAnnotations(annotations);
		updateCheckRunResponse.setResult(result);
	 
	 	return updateCheckRunResponse;
	}
}