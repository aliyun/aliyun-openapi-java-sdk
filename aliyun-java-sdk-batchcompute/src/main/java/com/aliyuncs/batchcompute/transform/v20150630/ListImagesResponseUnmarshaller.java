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
package com.aliyuncs.batchcompute.transform.v20150630;

import com.aliyuncs.batchcompute.model.v20150630.ListImagesResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.Image;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Created by guangchun.luo on 15/5/19.
 */
public class ListImagesResponseUnmarshaller {

    public static ListImagesResponse unmarshall(ListImagesResponse listImagesResponse, UnmarshallerContext context) throws ServerException {
        HttpResponse httpResponse = context.getHttpResponse();
        listImagesResponse.setHttpResponse(httpResponse);
        try {
            String body = new String(httpResponse.getContent(), httpResponse.getEncoding());
            parseImageList(body,listImagesResponse);

        } catch (UnsupportedEncodingException e) {
            throw new ServerException("API.EncodeError", "encode response body error",listImagesResponse.getRequestId());
        } catch (IOException e) {
            throw new ServerException("API.EncodeError", "encode response body error",listImagesResponse.getRequestId());
        }
        return listImagesResponse;
    }

    public static void parseImageList(String body, ListImagesResponse listImagesResponse) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Image> imageMap = mapper.readValue(body,
                new TypeReference<Map<String, Image>>() {
                });

        List<Image> imageList = new ArrayList();

        Iterator<String> keyIt = imageMap.keySet().iterator();

        while (keyIt.hasNext()) {
            String key = keyIt.next();
            Image img = imageMap.get(key);

            img.setImageId(key);

            imageList.add(img);
        }

        sortList(imageList);
        listImagesResponse.setImageList(imageList);
    }

    public static void sortList(List<Image> imageList) {
        Collections.sort(imageList, new Comparator<Image>() {
            public int compare(Image a, Image b) {
                int x = a.getImageId().compareTo(b.getImageId());
                if (x == 0) return 0;
                else return x < 0 ? -1 : 1;
            }
        });
    }
}
