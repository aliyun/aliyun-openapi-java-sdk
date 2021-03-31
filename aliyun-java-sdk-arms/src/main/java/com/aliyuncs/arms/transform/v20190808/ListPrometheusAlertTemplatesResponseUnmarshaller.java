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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListPrometheusAlertTemplatesResponse;
import com.aliyuncs.arms.model.v20190808.ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplate;
import com.aliyuncs.arms.model.v20190808.ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplate.Annotation;
import com.aliyuncs.arms.model.v20190808.ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplate.Label;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrometheusAlertTemplatesResponseUnmarshaller {

	public static ListPrometheusAlertTemplatesResponse unmarshall(ListPrometheusAlertTemplatesResponse listPrometheusAlertTemplatesResponse, UnmarshallerContext _ctx) {
		
		listPrometheusAlertTemplatesResponse.setRequestId(_ctx.stringValue("ListPrometheusAlertTemplatesResponse.RequestId"));

		List<PrometheusAlertTemplate> prometheusAlertTemplates = new ArrayList<PrometheusAlertTemplate>();
		for (int i = 0; i < _ctx.lengthValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates.Length"); i++) {
			PrometheusAlertTemplate prometheusAlertTemplate = new PrometheusAlertTemplate();
			prometheusAlertTemplate.setAlertName(_ctx.stringValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].AlertName"));
			prometheusAlertTemplate.setDescription(_ctx.stringValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].Description"));
			prometheusAlertTemplate.setType(_ctx.stringValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].Type"));
			prometheusAlertTemplate.setExpression(_ctx.stringValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].Expression"));
			prometheusAlertTemplate.setDuration(_ctx.stringValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].Duration"));
			prometheusAlertTemplate.setVersion(_ctx.stringValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].Version"));

			List<Label> labels = new ArrayList<Label>();
			for (int j = 0; j < _ctx.lengthValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].Labels.Length"); j++) {
				Label label = new Label();
				label.setName(_ctx.stringValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].Labels["+ j +"].Name"));
				label.setValue(_ctx.stringValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].Labels["+ j +"].Value"));

				labels.add(label);
			}
			prometheusAlertTemplate.setLabels(labels);

			List<Annotation> annotations = new ArrayList<Annotation>();
			for (int j = 0; j < _ctx.lengthValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].Annotations.Length"); j++) {
				Annotation annotation = new Annotation();
				annotation.setName(_ctx.stringValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].Annotations["+ j +"].Name"));
				annotation.setValue(_ctx.stringValue("ListPrometheusAlertTemplatesResponse.PrometheusAlertTemplates["+ i +"].Annotations["+ j +"].Value"));

				annotations.add(annotation);
			}
			prometheusAlertTemplate.setAnnotations(annotations);

			prometheusAlertTemplates.add(prometheusAlertTemplate);
		}
		listPrometheusAlertTemplatesResponse.setPrometheusAlertTemplates(prometheusAlertTemplates);
	 
	 	return listPrometheusAlertTemplatesResponse;
	}
}