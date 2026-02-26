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

import com.aliyuncs.devops.model.v20210625.CreateCheckRunResponse;
import com.aliyuncs.devops.model.v20210625.CreateCheckRunResponse.Result;
import com.aliyuncs.devops.model.v20210625.CreateCheckRunResponse.Result.CheckSuite;
import com.aliyuncs.devops.model.v20210625.CreateCheckRunResponse.Result.Check_run_annotations;
import com.aliyuncs.devops.model.v20210625.CreateCheckRunResponse.Result.Output;
import com.aliyuncs.devops.model.v20210625.CreateCheckRunResponse.Result.Output.Output_images;
import com.aliyuncs.devops.model.v20210625.CreateCheckRunResponse.Result.Writer;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCheckRunResponseUnmarshaller {

	public static CreateCheckRunResponse unmarshall(CreateCheckRunResponse createCheckRunResponse, UnmarshallerContext _ctx) {
		
		createCheckRunResponse.setRequestId(_ctx.stringValue("CreateCheckRunResponse.requestId"));
		createCheckRunResponse.setSuccess(_ctx.booleanValue("CreateCheckRunResponse.success"));
		createCheckRunResponse.setErrorCode(_ctx.stringValue("CreateCheckRunResponse.errorCode"));
		createCheckRunResponse.setErrorMessage(_ctx.stringValue("CreateCheckRunResponse.errorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateCheckRunResponse.result.id"));
		result.setCreatedAt(_ctx.stringValue("CreateCheckRunResponse.result.createdAt"));
		result.setUpdatedAt(_ctx.stringValue("CreateCheckRunResponse.result.updatedAt"));
		result.setStartedAt(_ctx.stringValue("CreateCheckRunResponse.result.startedAt"));
		result.setCompletedAt(_ctx.stringValue("CreateCheckRunResponse.result.completedAt"));
		result.setExternalId(_ctx.stringValue("CreateCheckRunResponse.result.externalId"));
		result.setName(_ctx.stringValue("CreateCheckRunResponse.result.name"));
		result.setHeadSha(_ctx.stringValue("CreateCheckRunResponse.result.headSha"));
		result.setStatus(_ctx.stringValue("CreateCheckRunResponse.result.status"));
		result.setConclusion(_ctx.stringValue("CreateCheckRunResponse.result.conclusion"));
		result.setDetailsUrl(_ctx.stringValue("CreateCheckRunResponse.result.detailsUrl"));

		CheckSuite checkSuite = new CheckSuite();
		checkSuite.setId(_ctx.longValue("CreateCheckRunResponse.result.checkSuite.id"));
		result.setCheckSuite(checkSuite);

		Writer writer = new Writer();
		writer.setId(_ctx.stringValue("CreateCheckRunResponse.result.writer.id"));
		writer.setType(_ctx.stringValue("CreateCheckRunResponse.result.writer.type"));
		writer.setName(_ctx.stringValue("CreateCheckRunResponse.result.writer.name"));
		writer.setSlug(_ctx.stringValue("CreateCheckRunResponse.result.writer.slug"));
		writer.setLogoUrl(_ctx.stringValue("CreateCheckRunResponse.result.writer.logoUrl"));
		result.setWriter(writer);

		Output output = new Output();
		output.setTitle(_ctx.stringValue("CreateCheckRunResponse.result.output.title"));
		output.setSummary(_ctx.stringValue("CreateCheckRunResponse.result.output.summary"));
		output.setText(_ctx.stringValue("CreateCheckRunResponse.result.output.text"));

		List<Output_images> images = new ArrayList<Output_images>();
		for (int i = 0; i < _ctx.lengthValue("CreateCheckRunResponse.result.output.images.Length"); i++) {
			Output_images output_images = new Output_images();
			output_images.setAlt(_ctx.stringValue("CreateCheckRunResponse.result.output.images["+ i +"].alt"));
			output_images.setImageUrl(_ctx.stringValue("CreateCheckRunResponse.result.output.images["+ i +"].imageUrl"));
			output_images.setCaption(_ctx.stringValue("CreateCheckRunResponse.result.output.images["+ i +"].caption"));

			images.add(output_images);
		}
		output.setImages(images);
		result.setOutput(output);

		List<Check_run_annotations> annotations = new ArrayList<Check_run_annotations>();
		for (int i = 0; i < _ctx.lengthValue("CreateCheckRunResponse.result.annotations.Length"); i++) {
			Check_run_annotations check_run_annotations = new Check_run_annotations();
			check_run_annotations.setId(_ctx.longValue("CreateCheckRunResponse.result.annotations["+ i +"].id"));
			check_run_annotations.setPath(_ctx.stringValue("CreateCheckRunResponse.result.annotations["+ i +"].path"));
			check_run_annotations.setStartLine(_ctx.longValue("CreateCheckRunResponse.result.annotations["+ i +"].startLine"));
			check_run_annotations.setEndLine(_ctx.longValue("CreateCheckRunResponse.result.annotations["+ i +"].endLine"));
			check_run_annotations.setStartColumn(_ctx.longValue("CreateCheckRunResponse.result.annotations["+ i +"].startColumn"));
			check_run_annotations.setEndColumn(_ctx.longValue("CreateCheckRunResponse.result.annotations["+ i +"].endColumn"));
			check_run_annotations.setAnnotationLevel(_ctx.stringValue("CreateCheckRunResponse.result.annotations["+ i +"].annotationLevel"));
			check_run_annotations.setMessage(_ctx.stringValue("CreateCheckRunResponse.result.annotations["+ i +"].message"));
			check_run_annotations.setTitle(_ctx.stringValue("CreateCheckRunResponse.result.annotations["+ i +"].title"));
			check_run_annotations.setRawDetails(_ctx.stringValue("CreateCheckRunResponse.result.annotations["+ i +"].rawDetails"));

			annotations.add(check_run_annotations);
		}
		result.setAnnotations(annotations);
		createCheckRunResponse.setResult(result);
	 
	 	return createCheckRunResponse;
	}
}