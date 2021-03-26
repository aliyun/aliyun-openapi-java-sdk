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

import com.aliyuncs.arms.model.v20190808.DescribePrometheusAlertRuleResponse;
import com.aliyuncs.arms.model.v20190808.DescribePrometheusAlertRuleResponse.PrometheusAlertRule;
import com.aliyuncs.arms.model.v20190808.DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Annotation;
import com.aliyuncs.arms.model.v20190808.DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Label;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePrometheusAlertRuleResponseUnmarshaller {

	public static DescribePrometheusAlertRuleResponse unmarshall(DescribePrometheusAlertRuleResponse describePrometheusAlertRuleResponse, UnmarshallerContext _ctx) {
		
		describePrometheusAlertRuleResponse.setRequestId(_ctx.stringValue("DescribePrometheusAlertRuleResponse.RequestId"));

		PrometheusAlertRule prometheusAlertRule = new PrometheusAlertRule();
		prometheusAlertRule.setAlertId(_ctx.longValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.AlertId"));
		prometheusAlertRule.setAlertName(_ctx.stringValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.AlertName"));
		prometheusAlertRule.setMessage(_ctx.stringValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Message"));
		prometheusAlertRule.setType(_ctx.stringValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Type"));
		prometheusAlertRule.setExpression(_ctx.stringValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Expression"));
		prometheusAlertRule.setDuration(_ctx.stringValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Duration"));
		prometheusAlertRule.setClusterId(_ctx.stringValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.ClusterId"));
		prometheusAlertRule.setStatus(_ctx.integerValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Status"));
		prometheusAlertRule.setDispatchRuleId(_ctx.longValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.DispatchRuleId"));
		prometheusAlertRule.setNotifyType(_ctx.stringValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.NotifyType"));

		List<Label> labels = new ArrayList<Label>();
		for (int i = 0; i < _ctx.lengthValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Labels.Length"); i++) {
			Label label = new Label();
			label.setName(_ctx.stringValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Labels["+ i +"].Name"));
			label.setValue(_ctx.stringValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Labels["+ i +"].Value"));

			labels.add(label);
		}
		prometheusAlertRule.setLabels(labels);

		List<Annotation> annotations = new ArrayList<Annotation>();
		for (int i = 0; i < _ctx.lengthValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Annotations.Length"); i++) {
			Annotation annotation = new Annotation();
			annotation.setName(_ctx.stringValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Annotations["+ i +"].Name"));
			annotation.setValue(_ctx.stringValue("DescribePrometheusAlertRuleResponse.PrometheusAlertRule.Annotations["+ i +"].Value"));

			annotations.add(annotation);
		}
		prometheusAlertRule.setAnnotations(annotations);
		describePrometheusAlertRuleResponse.setPrometheusAlertRule(prometheusAlertRule);
	 
	 	return describePrometheusAlertRuleResponse;
	}
}