/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainTopUrlVisitResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainTopUrlVisitResponse.UrlList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainTopUrlVisitResponseUnmarshaller {

	public static DescribeDomainTopUrlVisitResponse unmarshall(DescribeDomainTopUrlVisitResponse describeDomainTopUrlVisitResponse, UnmarshallerContext context) {
		
		describeDomainTopUrlVisitResponse.setRequestId(context.stringValue("DescribeDomainTopUrlVisitResponse.RequestId"));
		describeDomainTopUrlVisitResponse.setDomainName(context.stringValue("DescribeDomainTopUrlVisitResponse.DomainName"));
		describeDomainTopUrlVisitResponse.setStartTime(context.stringValue("DescribeDomainTopUrlVisitResponse.StartTime"));

		List<UrlList> allUrlList = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeDomainTopUrlVisitResponse.AllUrlList.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeDomainTopUrlVisitResponse.AllUrlList["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeDomainTopUrlVisitResponse.AllUrlList["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeDomainTopUrlVisitResponse.AllUrlList["+ i +"].FlowProportion"));

			allUrlList.add(urlList);
		}
		describeDomainTopUrlVisitResponse.setAllUrlList(allUrlList);

		List<UrlList> url200List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeDomainTopUrlVisitResponse.Url200List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeDomainTopUrlVisitResponse.Url200List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeDomainTopUrlVisitResponse.Url200List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeDomainTopUrlVisitResponse.Url200List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeDomainTopUrlVisitResponse.Url200List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeDomainTopUrlVisitResponse.Url200List["+ i +"].FlowProportion"));

			url200List.add(urlList);
		}
		describeDomainTopUrlVisitResponse.setUrl200List(url200List);

		List<UrlList> url300List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeDomainTopUrlVisitResponse.Url300List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeDomainTopUrlVisitResponse.Url300List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeDomainTopUrlVisitResponse.Url300List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeDomainTopUrlVisitResponse.Url300List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeDomainTopUrlVisitResponse.Url300List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeDomainTopUrlVisitResponse.Url300List["+ i +"].FlowProportion"));

			url300List.add(urlList);
		}
		describeDomainTopUrlVisitResponse.setUrl300List(url300List);

		List<UrlList> url400List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeDomainTopUrlVisitResponse.Url400List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeDomainTopUrlVisitResponse.Url400List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeDomainTopUrlVisitResponse.Url400List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeDomainTopUrlVisitResponse.Url400List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeDomainTopUrlVisitResponse.Url400List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeDomainTopUrlVisitResponse.Url400List["+ i +"].FlowProportion"));

			url400List.add(urlList);
		}
		describeDomainTopUrlVisitResponse.setUrl400List(url400List);

		List<UrlList> url500List = new ArrayList<UrlList>();
		for (int i = 0; i < context.lengthValue("DescribeDomainTopUrlVisitResponse.Url500List.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(context.stringValue("DescribeDomainTopUrlVisitResponse.Url500List["+ i +"].UrlDetail"));
			urlList.setVisitData(context.stringValue("DescribeDomainTopUrlVisitResponse.Url500List["+ i +"].VisitData"));
			urlList.setVisitProportion(context.floatValue("DescribeDomainTopUrlVisitResponse.Url500List["+ i +"].VisitProportion"));
			urlList.setFlow(context.stringValue("DescribeDomainTopUrlVisitResponse.Url500List["+ i +"].Flow"));
			urlList.setFlowProportion(context.floatValue("DescribeDomainTopUrlVisitResponse.Url500List["+ i +"].FlowProportion"));

			url500List.add(urlList);
		}
		describeDomainTopUrlVisitResponse.setUrl500List(url500List);
	 
	 	return describeDomainTopUrlVisitResponse;
	}
}