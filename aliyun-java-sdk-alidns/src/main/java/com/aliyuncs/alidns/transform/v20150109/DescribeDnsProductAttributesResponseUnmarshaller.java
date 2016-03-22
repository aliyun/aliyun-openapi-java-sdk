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
package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDnsProductAttributesResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsProductAttributesResponse.RecordLine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsProductAttributesResponseUnmarshaller {

	public static DescribeDnsProductAttributesResponse unmarshall(DescribeDnsProductAttributesResponse describeDnsProductAttributesResponse, UnmarshallerContext context) {
		
		describeDnsProductAttributesResponse.setRequestId(context.stringValue("DescribeDnsProductAttributesResponse.RequestId"));
		describeDnsProductAttributesResponse.setTtlMinValue(context.stringValue("DescribeDnsProductAttributesResponse.TtlMinValue"));
		describeDnsProductAttributesResponse.setTtlMaxValue(context.stringValue("DescribeDnsProductAttributesResponse.TtlMaxValue"));

		List<String> recordTypes = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDnsProductAttributesResponse.RecordTypes.Length"); i++) {
			recordTypes.add(context.stringValue("DescribeDnsProductAttributesResponse.RecordTypes["+ i +"]"));
		}
		describeDnsProductAttributesResponse.setRecordTypes(recordTypes);

		List<RecordLine> recordLines = new ArrayList<RecordLine>();
		for (int i = 0; i < context.lengthValue("DescribeDnsProductAttributesResponse.RecordLines.Length"); i++) {
			RecordLine recordLine = new RecordLine();
			recordLine.setLineCode(context.stringValue("DescribeDnsProductAttributesResponse.RecordLines["+ i +"].LineCode"));
			recordLine.setFatherCode(context.stringValue("DescribeDnsProductAttributesResponse.RecordLines["+ i +"].FatherCode"));
			recordLine.setLineName(context.stringValue("DescribeDnsProductAttributesResponse.RecordLines["+ i +"].LineName"));

			recordLines.add(recordLine);
		}
		describeDnsProductAttributesResponse.setRecordLines(recordLines);
	 
	 	return describeDnsProductAttributesResponse;
	}
}