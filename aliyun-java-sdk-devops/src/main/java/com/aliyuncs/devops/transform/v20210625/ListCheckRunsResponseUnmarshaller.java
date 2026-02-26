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

import com.aliyuncs.devops.model.v20210625.ListCheckRunsResponse;
import com.aliyuncs.devops.model.v20210625.ListCheckRunsResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListCheckRunsResponse.ResultItem.AnnotationsItem;
import com.aliyuncs.devops.model.v20210625.ListCheckRunsResponse.ResultItem.CheckSuite;
import com.aliyuncs.devops.model.v20210625.ListCheckRunsResponse.ResultItem.Output;
import com.aliyuncs.devops.model.v20210625.ListCheckRunsResponse.ResultItem.Output.ImagesItem;
import com.aliyuncs.devops.model.v20210625.ListCheckRunsResponse.ResultItem.Writer;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCheckRunsResponseUnmarshaller {

	public static ListCheckRunsResponse unmarshall(ListCheckRunsResponse listCheckRunsResponse, UnmarshallerContext _ctx) {
		
		listCheckRunsResponse.setRequestId(_ctx.stringValue("ListCheckRunsResponse.requestId"));
		listCheckRunsResponse.setSuccess(_ctx.booleanValue("ListCheckRunsResponse.success"));
		listCheckRunsResponse.setErrorCode(_ctx.stringValue("ListCheckRunsResponse.errorCode"));
		listCheckRunsResponse.setErrorMessage(_ctx.stringValue("ListCheckRunsResponse.errorMessage"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCheckRunsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListCheckRunsResponse.result["+ i +"].id"));
			resultItem.setCreatedAt(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].createdAt"));
			resultItem.setUpdatedAt(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].updatedAt"));
			resultItem.setStartedAt(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].startedAt"));
			resultItem.setCompletedAt(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].completedAt"));
			resultItem.setExternalId(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].externalId"));
			resultItem.setName(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].name"));
			resultItem.setHeadSha(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].headSha"));
			resultItem.setStatus(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].status"));
			resultItem.setConclusion(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].conclusion"));
			resultItem.setDetailsUrl(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].detailsUrl"));

			CheckSuite checkSuite = new CheckSuite();
			checkSuite.setId(_ctx.longValue("ListCheckRunsResponse.result["+ i +"].checkSuite.id"));
			resultItem.setCheckSuite(checkSuite);

			Writer writer = new Writer();
			writer.setId(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].writer.id"));
			writer.setType(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].writer.type"));
			writer.setName(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].writer.name"));
			writer.setSlug(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].writer.slug"));
			writer.setLogoUrl(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].writer.logoUrl"));
			resultItem.setWriter(writer);

			Output output = new Output();
			output.setTitle(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].output.title"));
			output.setSummary(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].output.summary"));
			output.setText(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].output.text"));

			List<ImagesItem> images = new ArrayList<ImagesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCheckRunsResponse.result["+ i +"].output.images.Length"); j++) {
				ImagesItem imagesItem = new ImagesItem();
				imagesItem.setAlt(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].output.images["+ j +"].alt"));
				imagesItem.setImageUrl(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].output.images["+ j +"].imageUrl"));
				imagesItem.setCaption(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].output.images["+ j +"].caption"));

				images.add(imagesItem);
			}
			output.setImages(images);
			resultItem.setOutput(output);

			List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCheckRunsResponse.result["+ i +"].annotations.Length"); j++) {
				AnnotationsItem annotationsItem = new AnnotationsItem();
				annotationsItem.setId(_ctx.longValue("ListCheckRunsResponse.result["+ i +"].annotations["+ j +"].id"));
				annotationsItem.setPath(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].annotations["+ j +"].path"));
				annotationsItem.setStartLine(_ctx.longValue("ListCheckRunsResponse.result["+ i +"].annotations["+ j +"].startLine"));
				annotationsItem.setEndLine(_ctx.longValue("ListCheckRunsResponse.result["+ i +"].annotations["+ j +"].endLine"));
				annotationsItem.setStartColumn(_ctx.longValue("ListCheckRunsResponse.result["+ i +"].annotations["+ j +"].startColumn"));
				annotationsItem.setEndColumn(_ctx.longValue("ListCheckRunsResponse.result["+ i +"].annotations["+ j +"].endColumn"));
				annotationsItem.setAnnotationLevel(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].annotations["+ j +"].annotationLevel"));
				annotationsItem.setMessage(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].annotations["+ j +"].message"));
				annotationsItem.setTitle(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].annotations["+ j +"].title"));
				annotationsItem.setRawDetails(_ctx.stringValue("ListCheckRunsResponse.result["+ i +"].annotations["+ j +"].rawDetails"));

				annotations.add(annotationsItem);
			}
			resultItem.setAnnotations(annotations);

			result.add(resultItem);
		}
		listCheckRunsResponse.setResult(result);
	 
	 	return listCheckRunsResponse;
	}
}