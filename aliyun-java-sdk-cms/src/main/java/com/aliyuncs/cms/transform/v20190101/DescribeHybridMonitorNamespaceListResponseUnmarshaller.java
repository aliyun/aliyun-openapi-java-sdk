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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorNamespaceListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespaceItem;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespaceItem.AliyunProductMetric;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespaceItem.AliyunProductMetric.Namespace;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespaceItem.AliyunProductMetric.Namespace.Metric;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespaceItem.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHybridMonitorNamespaceListResponseUnmarshaller {

	public static DescribeHybridMonitorNamespaceListResponse unmarshall(DescribeHybridMonitorNamespaceListResponse describeHybridMonitorNamespaceListResponse, UnmarshallerContext _ctx) {
		
		describeHybridMonitorNamespaceListResponse.setRequestId(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.RequestId"));
		describeHybridMonitorNamespaceListResponse.setSuccess(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.Success"));
		describeHybridMonitorNamespaceListResponse.setCode(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.Code"));
		describeHybridMonitorNamespaceListResponse.setMessage(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.Message"));
		describeHybridMonitorNamespaceListResponse.setPageSize(_ctx.integerValue("DescribeHybridMonitorNamespaceListResponse.PageSize"));
		describeHybridMonitorNamespaceListResponse.setPageNumber(_ctx.integerValue("DescribeHybridMonitorNamespaceListResponse.PageNumber"));
		describeHybridMonitorNamespaceListResponse.setTotal(_ctx.integerValue("DescribeHybridMonitorNamespaceListResponse.Total"));

		List<DescribeHybridMonitorNamespaceItem> describeHybridMonitorNamespace = new ArrayList<DescribeHybridMonitorNamespaceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace.Length"); i++) {
			DescribeHybridMonitorNamespaceItem describeHybridMonitorNamespaceItem = new DescribeHybridMonitorNamespaceItem();
			describeHybridMonitorNamespaceItem.setDescription(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].Description"));
			describeHybridMonitorNamespaceItem.setCreateTime(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].CreateTime"));
			describeHybridMonitorNamespaceItem.setNamespace(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].Namespace"));
			describeHybridMonitorNamespaceItem.setIsDelete(_ctx.integerValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].IsDelete"));
			describeHybridMonitorNamespaceItem.setId(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].Id"));
			describeHybridMonitorNamespaceItem.setModifyTime(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].ModifyTime"));
			describeHybridMonitorNamespaceItem.setNotAliyunTaskNumber(_ctx.longValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].NotAliyunTaskNumber"));

			Detail detail = new Detail();
			detail.setSpec(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].Detail.Spec"));
			describeHybridMonitorNamespaceItem.setDetail(detail);

			List<AliyunProductMetric> aliyunProductMetricList = new ArrayList<AliyunProductMetric>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].AliyunProductMetricList.Length"); j++) {
				AliyunProductMetric aliyunProductMetric = new AliyunProductMetric();
				aliyunProductMetric.setUserId(_ctx.longValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].AliyunProductMetricList["+ j +"].UserId"));
				aliyunProductMetric.setYAMLConfig(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].AliyunProductMetricList["+ j +"].YAMLConfig"));

				List<Namespace> namespaceList = new ArrayList<Namespace>();
				for (int k = 0; k < _ctx.lengthValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].AliyunProductMetricList["+ j +"].NamespaceList.Length"); k++) {
					Namespace namespace = new Namespace();
					namespace.setNamespace(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].AliyunProductMetricList["+ j +"].NamespaceList["+ k +"].Namespace"));

					List<Metric> metricList = new ArrayList<Metric>();
					for (int l = 0; l < _ctx.lengthValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].AliyunProductMetricList["+ j +"].NamespaceList["+ k +"].MetricList.Length"); l++) {
						Metric metric = new Metric();
						metric.setPeriod(_ctx.longValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].AliyunProductMetricList["+ j +"].NamespaceList["+ k +"].MetricList["+ l +"].Period"));

						List<String> list = new ArrayList<String>();
						for (int m = 0; m < _ctx.lengthValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].AliyunProductMetricList["+ j +"].NamespaceList["+ k +"].MetricList["+ l +"].List.Length"); m++) {
							list.add(_ctx.stringValue("DescribeHybridMonitorNamespaceListResponse.DescribeHybridMonitorNamespace["+ i +"].AliyunProductMetricList["+ j +"].NamespaceList["+ k +"].MetricList["+ l +"].List["+ m +"]"));
						}
						metric.setList(list);

						metricList.add(metric);
					}
					namespace.setMetricList(metricList);

					namespaceList.add(namespace);
				}
				aliyunProductMetric.setNamespaceList(namespaceList);

				aliyunProductMetricList.add(aliyunProductMetric);
			}
			describeHybridMonitorNamespaceItem.setAliyunProductMetricList(aliyunProductMetricList);

			describeHybridMonitorNamespace.add(describeHybridMonitorNamespaceItem);
		}
		describeHybridMonitorNamespaceListResponse.setDescribeHybridMonitorNamespace(describeHybridMonitorNamespace);
	 
	 	return describeHybridMonitorNamespaceListResponse;
	}
}